package com.cssl.pojo.discuss;

import com.cssl.pojo.User.Aoa_user;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by asus on 2018/9/26.
 */
@Getter
@Setter
public class Aoa_comment_list {
        private int comment_id;
        private String  comment;
        private Date time;
        private Aoa_user user;
        private Aoa_reply_list  reply;

    public Aoa_comment_list(String comment, Date time, Aoa_user user, Aoa_reply_list reply) {
        this.comment = comment;
        this.time = time;
        this.user = user;
        this.reply = reply;
    }

    public Aoa_comment_list() {
    }
}
