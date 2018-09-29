package com.cssl.pojo.process;

import lombok.Getter;
import lombok.Setter;
import retrofit2.http.GET;

/**
 * 请假表
 */
@Getter
@Setter
public class Aoa_holiday {
    private int holiday_id;
    private int type_id;//请假类型
    private Double leave_days;//请假天数
    private Aoa_ProcessList processList;
    private String personnel_advice;//人事部意见及说明
    private  String manager_advice;//经理意见及说明

    public Aoa_holiday(int type_id, Double leave_days, Aoa_ProcessList processList, String personnel_advice, String manager_advice) {
        this.type_id = type_id;
        this.leave_days = leave_days;
        this.processList = processList;
        this.personnel_advice = personnel_advice;
        this.manager_advice = manager_advice;
    }

    public Aoa_holiday() {
    }
}
