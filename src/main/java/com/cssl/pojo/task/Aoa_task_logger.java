package com.cssl.pojo.task;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 任务日志表.
 */
@Getter
@Setter
public class Aoa_task_logger {
    private int logger_id;
    private Date create_time;//任务日志创建时间
    private String logger_ticking;//任务日志反馈内容
    private Aoa_task_list task;//任务外键
    private String username;//任务日志生成人
    private int  logger_statusid;//状态id

    public Aoa_task_logger(Date create_time, String logger_ticking, Aoa_task_list task, String username, int logger_statusid) {
        this.create_time = create_time;
        this.logger_ticking = logger_ticking;
        this.task = task;
        this.username = username;
        this.logger_statusid = logger_statusid;
    }

    public Aoa_task_logger() {
    }
}
