package com.cssl.pojo.notice;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 通知模块通知总表
 */
@Getter
@Setter
public class Aoa_notice_list {
    private int notice_id;
    private int user_id;
    private int type_id;
    private int status_id;
    private String title; // 通知标题
    private String content; // 通知内容
    private String url; // 通知内的链接
    private Boolean is_top=false;
    private Date  notice_time;
    private Date modify_time=new Date();

    public Aoa_notice_list(int user_id, int type_id, int status_id, String title, String content, String url, Boolean is_top, Date notice_time, Date modify_time) {
        this.user_id = user_id;
        this.type_id = type_id;
        this.status_id = status_id;
        this.title = title;
        this.content = content;
        this.url = url;
        this.is_top = is_top;
        this.notice_time = notice_time;
        this.modify_time = modify_time;
    }

    public Aoa_notice_list() {
    }
}
