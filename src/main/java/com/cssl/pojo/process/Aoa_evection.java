package com.cssl.pojo.process;

import lombok.Getter;
import lombok.Setter;

/**
 * 出差表
 */
@Getter
@Setter
public class Aoa_evection {
    private int evection_id;
    private int type_id;//外出类型
    private String personnel_advice;//人事部意见及说明
    private Aoa_ProcessList processList;
    private String manager_advice;//经理意见及说明

    public Aoa_evection(int type_id, String personnel_advice, Aoa_ProcessList processList, String manager_advice) {
        this.type_id = type_id;
        this.personnel_advice = personnel_advice;
        this.processList = processList;
        this.manager_advice = manager_advice;
    }

    public Aoa_evection() {
    }
}
