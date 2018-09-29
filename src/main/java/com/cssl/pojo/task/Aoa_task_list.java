package com.cssl.pojo.task;

import com.cssl.pojo.User.Aoa_user;
import lombok.Getter;
import lombok.Setter;
import retrofit2.http.GET;

import java.io.Serializable;
import java.util.Date;

/**
 * 任务表
 */
@Getter
@Setter
public class Aoa_task_list implements Serializable {
        private int task_id;
        private int type_id;//任务类型（公事，私事）
        private Date publish_time;//发布时间
        private Date star_time;//任务开始时间
        private Date end_time;//任务结束时间
        private Date modify_time;//任务修改时间
        private String title;//任务主题
        private String reciverlist;//接受人
        private Aoa_user user;//发布人id
        private String task_describe;//任务描述
        private String comment;//任务评价
        private boolean is_top=false;//任务是否置顶
        private boolean is_cancel=false;//是否取消任务
        private String ticking;//任务结束后反馈
        private String status_id;//任务状态id

    public Aoa_task_list(int type_id, Date publish_time, Date star_time, Date end_time, Date modify_time, String title, String reciverlist, Aoa_user user, String task_describe, String comment, boolean is_top, boolean is_cancel, String ticking, String status_id) {
        this.type_id = type_id;
        this.publish_time = publish_time;
        this.star_time = star_time;
        this.end_time = end_time;
        this.modify_time = modify_time;
        this.title = title;
        this.reciverlist = reciverlist;
        this.user = user;
        this.task_describe = task_describe;
        this.comment = comment;
        this.is_top = is_top;
        this.is_cancel = is_cancel;
        this.ticking = ticking;
        this.status_id = status_id;
    }

    public Aoa_task_list() {
    }
}
