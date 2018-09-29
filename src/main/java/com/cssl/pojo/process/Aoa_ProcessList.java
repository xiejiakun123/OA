package com.cssl.pojo.process;

import com.cssl.pojo.User.Aoa_user;
import com.cssl.pojo.note.Aoa_attachment_list;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 主表
 */
@Getter
@Setter
public class Aoa_ProcessList {
    private int process_id;
    private String type_name; //流程申请类型
    private int status_id;//流程审核状态 id
    private int deeply_id;//紧急程度
    private String process_name;//标题
    private String process_des;//流程申请原因内容
    private Aoa_user user;//流程申请人
    private Date apply_time;//流程申请时间
    private Boolean is_checked=false;//流程是否被驳回
    private Date start_time;//流程开始时间
    private Date end_time;//流程结束时间
    private Double procsee_days;//流程总天数
    private Aoa_attachment_list aoa_attachment_list; //流程附件id
    private String shenuser;//没卵用的列

    public Aoa_ProcessList(String type_name, int status_id, int deeply_id, String process_name, String process_des, Aoa_user user, Date apply_time, Boolean is_checked, Date start_time, Date end_time, Double procsee_days, Aoa_attachment_list aoa_attachment_list, String shenuser) {
        this.type_name = type_name;
        this.status_id = status_id;
        this.deeply_id = deeply_id;
        this.process_name = process_name;
        this.process_des = process_des;
        this.user = user;
        this.apply_time = apply_time;
        this.is_checked = is_checked;
        this.start_time = start_time;
        this.end_time = end_time;
        this.procsee_days = procsee_days;
        this.aoa_attachment_list = aoa_attachment_list;
        this.shenuser = shenuser;
    }

    public Aoa_ProcessList() {
    }
}
