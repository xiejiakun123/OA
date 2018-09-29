package com.cssl.pojo.mail;

import com.cssl.pojo.User.Aoa_user;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by asus on 2018/9/26.
 */
@Getter
@Setter
public class Aoa_mailnumber {
    private int mail_number_id;
    private int mail_type;//邮件账号类型
    private int status;//邮件状态（是否可用 1可用 2禁用）
    private Aoa_user user;//用户id
    private String mail_user_name;//用户别名
    private Date mail_create_time;//账号创建时间
    private String mail_account;//邮件账号
    private String password;//账号授权码
    private String mail_des;//账号信息备注

    public Aoa_mailnumber(int mail_type, int status, Aoa_user user, String mail_user_name, Date mail_create_time, String mail_account, String password, String mail_des) {
        this.mail_type = mail_type;
        this.status = status;
        this.user = user;
        this.mail_user_name = mail_user_name;
        this.mail_create_time = mail_create_time;
        this.mail_account = mail_account;
        this.password = password;
        this.mail_des = mail_des;
    }

    public Aoa_mailnumber() {
    }
}
