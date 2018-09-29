package com.cssl.controller;



import com.cssl.pojo.User.Aoa_user;
import com.cssl.pojo.User.Aoa_user_log;
import com.cssl.pojo.User.Aoa_user_login_record;
import com.cssl.pojo.mail.Aoa_mail_reciver;
import com.cssl.pojo.notice.Aoa_notice_user_relation;
import com.cssl.pojo.system.Aoa_sys_menu;
import com.cssl.pojo.task.Aoa_task_user;
import com.cssl.service.User.UserLogService;
import com.cssl.service.User.UserService;
import com.cssl.service.mail.MailService;
import com.cssl.service.notice.NoticeService;
import com.cssl.service.system.RolepowerService;
import com.cssl.service.task.TaskService;
import eu.bitwalker.useragentutils.Browser;
import eu.bitwalker.useragentutils.UserAgent;
import eu.bitwalker.useragentutils.Version;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Created by asus on 2018/9/18.
 */
@Controller
public class UsersController {
  @Autowired
  private UserService userService;
  @Autowired
  private RolepowerService rolepowerService;
  @Autowired
  private NoticeService noticeService;
  @Autowired
  private MailService mailService;
  @Autowired
  private TaskService taskService;
  @Autowired
  private UserLogService userLogService;

  DefaultConversionService service = new DefaultConversionService();

  @RequestMapping("/lg")
    public String lg(){
      return "login/login";
  }

  /**
   * 验证码
   * @param request
   * @param response
   * @param session
   * @throws IOException
   */
  @RequestMapping("/captcha")
  public void captcha(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws IOException {
    response.setHeader("Pragma", "No-cache");
    response.setHeader("Cache-Control", "no-cache");
    response.setDateHeader("Expires", 0);
    response.setContentType("image/jpeg");

    // 生成随机字串
    String verifyCode = VerifyCodeUtils.generateVerifyCode(4);

    // 生成图片
    int w = 135, h = 40;
    VerifyCodeUtils.outputImage(w, h, response.getOutputStream(), verifyCode);

    // 将验证码存储在session以便登录时校验
    session.setAttribute("session_captcha", verifyCode.toLowerCase());
  }

  /**
   * spring框架util包中的StringUtils类主要是处理关于字符串的功能方法
   * isEmpty()判断字符串是否为空，如果为nul或者""则返回true，否则返回false
   * @param session
   * @return
   */
  @RequestMapping("/handlehas")
  public String handleHas(HttpSession session){
    System.out.println("handleHas");
    if(!StringUtils.isEmpty(session.getAttribute("user"))){
      Aoa_user user=(Aoa_user) session.getAttribute("user");
      System.out.println(user);
      session.removeAttribute("userId");
      session.setAttribute("userId", user.getUser_id());
    }else{
      System.out.println("有问题！");
      return "login/login";
    }
    return "redirect:/index";

  }







  @RequestMapping("/logins")
  public String ndex(Aoa_user user , Model model,HttpSession session,String code,HttpServletRequest request) throws UnknownHostException {

    System.out.println("logins");
    String session_captcha=(String) session.getAttribute("session_captcha");
    if(!session_captcha.toLowerCase().equals(code)){
      System.out.println("验证码输入错误!");
      model.addAttribute("errormess", "验证码输入错误!");
      request.setAttribute("errormess","验证码输入错误!");
      return "login/login";
    }
    Aoa_user userLogin =userService.findOneUser(user);
    if(userLogin==null){
      System.out.println(user);
      System.out.println("账号或密码错误!");
      model.addAttribute("errormess", "账号或密码错误!");
      return "login/login";
    }
    if(userLogin.getIs_lock()==1){
      System.out.println("账号已被冻结!");
      model.addAttribute("errormess", "账号已被冻结!");
      return "login/login";
    }
    List<Integer> userIdList=(List<Integer>)session.getAttribute("userList");//取session登陆的userid集合
    if(userIdList==null){
      userIdList=new ArrayList<>();
    }
    if(userIdList.contains(userLogin.getUser_id())){
      System.out.println("当前用户已经登录了");
      model.addAttribute("hasmess", "当前用户已经登录了；不能重复登录");
      session.setAttribute("thisuser", userLogin);
      return "login/login";
    }else{
      System.out.println("登陆成功");
      userIdList.add(userLogin.getUser_id());
      //登陆成功新增登陆记录
      //request.getHeader("user-agent")); //返回客户端浏览器的版本号、类型
      session.setAttribute("userId", userLogin.getUser_id());
      session.setAttribute("user",userLogin);
      Browser browser = UserAgent.parseUserAgentString(request.getHeader("User-Agent")).getBrowser();
      Version version = browser.getVersion(request.getHeader("User-Agent"));

      String info = browser.getName() + "/" + version.getVersion();
      System.out.println("info:"+info);
      String ip= InetAddress.getLocalHost().getHostAddress();
      System.out.println("ip:"+ip);
      Aoa_user_login_record record=new Aoa_user_login_record(ip,info,new Date(),userLogin);
      int result=userService.saveLogionRecord(record);
      System.out.println("新增登陆记录："+result);
    }
   /* Aoa_user user1=userService.findOneUser(user);
    System.out.println(user1.getRole().getRole_id());
    if(user1!=null){
    session.setAttribute("user",user1);
      return "redirect:/index";
    }*/
  return "redirect:/index";
  }
@RequestMapping("/index")
  public String index(HttpServletRequest req, Model model){
    HttpSession session = req.getSession();
    Aoa_user user=(Aoa_user)session.getAttribute("user");
    System.out.println(user.getRole().getRole_id());
  System.out.println(user.getDept().getDept_id());
    System.out.println(user.getDept().getDept_name());
    rolepowerService.findMenuSys(req,user);
    List<Aoa_notice_user_relation> notice=noticeService.cxjl(user.getUser_id());
    List<Aoa_mail_reciver> mail=mailService.cxyx(user.getUser_id());
    List<Aoa_task_user> task=taskService.cxsk(user.getUser_id());
    model.addAttribute("mail",mail.size());
    model.addAttribute("task",task.size());
    model.addAttribute("notice",notice.size());
    List<Aoa_user_log> userLogs=userLogService.cxlg(user.getUser_id());
    model.addAttribute("userLogList",userLogs);
  return "index/index";
}
@RequestMapping("/menucha")
  public String menucha( Model model,HttpSession session,HttpServletRequest req){
  Aoa_user user=(Aoa_user)session.getAttribute("user");
  String val=null;
  if(!StringUtils.isEmpty(req.getParameter("val"))){
    val=req.getParameter("val");
  }
  if(!StringUtils.isEmpty(val)){
    List<Aoa_sys_menu> oneMenuAll =rolepowerService.findfcd(user.getRole().getRole_id(),val);
    List<Aoa_sys_menu> twoMenuAll=null;
    for (int i = 0; i < oneMenuAll.size(); i++) {
      twoMenuAll=rolepowerService.findzcd(user.getRole().getRole_id(),oneMenuAll.get(i).getMenu_id());
    }
    model.addAttribute("oneMenuAll",oneMenuAll);
    model.addAttribute("twoMenuAll", twoMenuAll);
  }
  else{
    rolepowerService.findMenuSys(req,user);
  }
  return "common/leftlists";
}







}
