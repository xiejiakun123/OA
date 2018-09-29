package com.cssl.pojo.plan;

import com.cssl.pojo.User.Aoa_user;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 计划表
 */
@Getter
@Setter

public class Aoa_plan_list {
    private int plan_id;//主键
    private int type_id;//类型id
    private int status_id;//状态id
    private Aoa_user user;//用户外键
    private int attach_id;//附件id
    private Date start_time;//开始时间
    private Date end_time;//结束时间
    private Date create_time;//记录时间
    private String title;   //标题
    private String label;   //标签
    private String plan_content;//计划内容
    private String plan_summary;//计划总结
    private String plan_comment;//计划评论

    public Aoa_plan_list(int type_id, int status_id, Aoa_user user, int attach_id, Date start_time, Date end_time, Date create_time, String title, String label, String plan_content, String plan_summary, String plan_comment) {
        this.type_id = type_id;
        this.status_id = status_id;
        this.user = user;
        this.attach_id = attach_id;
        this.start_time = start_time;
        this.end_time = end_time;
        this.create_time = create_time;
        this.title = title;
        this.label = label;
        this.plan_content = plan_content;
        this.plan_summary = plan_summary;
        this.plan_comment = plan_comment;
    }

    public Aoa_plan_list() {
    }
}
