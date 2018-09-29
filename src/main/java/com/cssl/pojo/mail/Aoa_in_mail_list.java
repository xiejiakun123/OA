package com.cssl.pojo.mail;

import com.cssl.pojo.User.Aoa_user;
import com.cssl.pojo.note.Aoa_attachment_list;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by asus on 2018/9/26.
 */
@Getter
@Setter
public class Aoa_in_mail_list {
    private int mail_id;
    private int mail_type;//邮件类型（通知，公告，邮件）
    private int mail_status_id;//邮件状态（一般，紧急，重要）
    private Aoa_user user;//发件人
    private String mail_title;//邮箱主题
    private String mail_contet;//邮箱内容
    private String in_receiver;//收件人
    private Date mail_create_time;//接收时间
    private boolean mail_del=false;
    private boolean mail_push=false;
    private boolean mail_star=false;
    private Aoa_attachment_list attachment_list;
    private Aoa_mailnumber mailnumber;





}
