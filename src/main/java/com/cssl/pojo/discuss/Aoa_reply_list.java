package com.cssl.pojo.discuss;

import com.cssl.pojo.User.Aoa_user;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by asus on 2018/9/26.
 */
@Setter
@Getter
public class Aoa_reply_list {
    private int reply_id;
    private String content;
    private Date replay_time;
    private Aoa_user user;
    private Aoa_discuss_list discuss_list;

    public Aoa_reply_list(String content, Date replay_time, Aoa_user user, Aoa_discuss_list discuss_list) {
        this.content = content;
        this.replay_time = replay_time;
        this.user = user;
        this.discuss_list = discuss_list;
    }

    public Aoa_reply_list() {
    }
}
