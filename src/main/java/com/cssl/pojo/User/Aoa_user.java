package com.cssl.pojo.User;

import com.cssl.pojo.Role.Aoa_role_;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by asus on 2018/9/24.
 */
@Getter
@Setter
public class Aoa_user {
    private int user_id;	//用户id
    private String address;//地址
    private String user_name;//登录用户名
    private String user_tel;//用户电话
    private String password;//密码
    private String user_edu;//学历
    private String bank;//
    private Date birth;//银行卡号
    private String eamil;//邮箱
    private String user_idcard;//用户身份证
    private String theme_skin;//皮肤
    private String img_path;//图片路径
    private Date hire_time;//入职时间
    private String salary;//用户薪水
    private String last_login_ip;//最后登录ip
    private Date last_login_time;//最后登录时间
    private  Date modify_time;//最后修改时间
    private int modify_user_id;//最后修改此用户的用户id
    private int father_id;//上司id
    private int holiday;//请假天数
    private String pinyin;//用户拼音
    private boolean superman;
    private int is_lock;//用户是否被禁用
    private Aoa_role_ role;//外键关联 角色表
    private Aoa_dept dept;//外键关联 部门表
    private Aoa_position position;	//外键关联 职位表

}
