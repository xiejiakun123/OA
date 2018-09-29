package com.cssl.pojo.discuss;

import com.cssl.pojo.User.Aoa_user;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

/**
 * Created by asus on 2018/9/26.
 */
@Getter
@Setter
public class Aoa_discuss_list {
    private int discuss_id;//主键Id
    private int type_id;//类型id
    private int status_id;//没卵用的Id
    private Date create_time;//时间
    private Date modify_time;//没卵用的时间
    private int visit_num;//总记录数
    private int attachment_id;//区分Id
    private String title;//标题
    private String content;//内容
    private Aoa_user user;//用户外键
    private Aoa_voteList voteList;//投票Id

    public Aoa_discuss_list(int type_id, int status_id, Date create_time, int visit_num, int attachment_id, String title, String content) {
        this.type_id = type_id;
        this.status_id = status_id;
        this.create_time = create_time;
        this.visit_num = visit_num;
        this.attachment_id = attachment_id;
        this.title = title;
        this.content = content;
    }

    public Aoa_discuss_list() {
    }
}
