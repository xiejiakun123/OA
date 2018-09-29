package com.cssl.pojo.User;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by asus on 2018/9/26.
 */
@Getter
@Setter
public class Aoa_user_login_record {
    private int record_id;//记录id
    private String ip_addr;//ip地址
    private String  browser;//使用浏览器
    private Date login_time;//登陆时间
    private String session_id;
    private Aoa_user user;//用户外键

    public Aoa_user_login_record(String ip_addr, String browser, Date login_time, Aoa_user user) {
        this.ip_addr = ip_addr;
        this.browser = browser;
        this.login_time = login_time;
        this.user = user;
    }

    public Aoa_user_login_record() {
    }
}
