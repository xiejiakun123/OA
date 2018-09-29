package com.cssl.pojo.mail;

import com.cssl.pojo.User.Aoa_user;
import lombok.Getter;
import lombok.Setter;


/**
 * //内部邮件收件人中间表
 */
@Getter
@Setter
public class Aoa_mail_reciver {
    private int  pk_id;
    private Aoa_in_mail_list in_mail;
    private Aoa_user user;
    private Boolean is_read=false;//是否已读
    private Boolean is_star=false;//是否星标
    private Boolean is_del=false;//是否真正删除

    public Aoa_mail_reciver(Aoa_in_mail_list in_mail, Aoa_user user, Boolean is_read, Boolean is_star, Boolean is_del) {
        this.in_mail = in_mail;
        this.user = user;
        this.is_read = is_read;
        this.is_star = is_star;
        this.is_del = is_del;
    }

    public Aoa_mail_reciver() {
    }
}
