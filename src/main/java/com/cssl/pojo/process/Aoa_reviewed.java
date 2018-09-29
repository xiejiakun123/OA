package com.cssl.pojo.process;

import com.cssl.pojo.User.Aoa_user;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 审核表
 */
@Getter
@Setter
public class Aoa_reviewed {
    private int  reviewed_id;
    private Aoa_user user;//审核人
    private String advice; //审核人意见
    private Long statusId;//审核人状态
    private Date reviewed_time;//审核时间
    private Boolean del=false;
    private Aoa_ProcessList processList;

    public Aoa_reviewed(Aoa_user user, String advice, Long statusId, Date reviewed_time, Boolean del, Aoa_ProcessList processList) {
        this.user = user;
        this.advice = advice;
        this.statusId = statusId;
        this.reviewed_time = reviewed_time;
        this.del = del;
        this.processList = processList;
    }

    public Aoa_reviewed() {
    }
}
