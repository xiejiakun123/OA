package com.cssl.pojo.task;

import com.cssl.pojo.User.Aoa_user;
import lombok.Getter;
import lombok.Setter;

/**
 *任务接收人联系表
 */
@Getter
@Setter
public class Aoa_task_user {
    private  int pk_id;
    private Aoa_task_list task_list;//任务外键
    private Aoa_user user;//任务接受人
    private int status_id;//任务状态id

    public Aoa_task_user(Aoa_task_list task_list, Aoa_user user, int status_id) {
        this.task_list = task_list;
        this.user = user;
        this.status_id = status_id;
    }

    public Aoa_task_user() {
    }
}
