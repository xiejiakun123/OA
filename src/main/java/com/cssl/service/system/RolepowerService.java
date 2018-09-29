package com.cssl.service.system;

import com.cssl.dao.role.RolepowerlistDao;
import com.cssl.pojo.User.Aoa_user;
import com.cssl.pojo.system.Aoa_sys_menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by asus on 2018/9/24.
 */
@Service
public class RolepowerService {
    @Autowired
    private RolepowerlistDao rolepowerlistDao;

    public List<Aoa_sys_menu> findbyparentall( int id){
        return rolepowerlistDao.findbyparentall(id);
    }
    public List<Aoa_sys_menu>  findfcd(int id,String name){
        return rolepowerlistDao.findfcd(id,name);
    }
    public List<Aoa_sys_menu>  findzcd(int id,int pid){
        return rolepowerlistDao.findzcd(id,pid);
    }

    public void findMenuSys(HttpServletRequest req, Aoa_user aoa_user){
        List<Aoa_sys_menu> oneMenuAll=rolepowerlistDao.findbyparentall(aoa_user.getRole().getRole_id());
        List<Aoa_sys_menu> twoMenuAll=rolepowerlistDao.findbyparentsxian( aoa_user.getRole().getRole_id());
        req.setAttribute("oneMenuAll", oneMenuAll);
        req.setAttribute("twoMenuAll", twoMenuAll);
    }



}
