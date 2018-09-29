package com.cssl.pojo.User;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by asus on 2018/9/26.
 */

@Getter
@Setter
public class Aoa_user_log {
    private int log_id;
    private String ip_addr;//ip地址
    private Date log_time;
    private String title;
    private String  url;
    private Aoa_user user;

    public Aoa_user_log(String ip_addr, Date log_time, String title, String url, Aoa_user user) {
        this.ip_addr = ip_addr;
        this.log_time = log_time;
        this.title = title;
        this.url = url;
        this.user = user;
    }

    public Aoa_user_log() {
    }
}
