package com.cssl.pojo.process;

import lombok.Getter;
import lombok.Setter;

/**
 * 加班表
 */
@Getter
@Setter


public class Aoa_overtime {
    private int overtime_id;
    private int typeId;
    private Aoa_ProcessList processList;
    private String personnel_advice;
    private String manager_advice;

    public Aoa_overtime(int typeId, Aoa_ProcessList processList, String personnel_advice, String manager_advice) {
        this.typeId = typeId;
        this.processList = processList;
        this.personnel_advice = personnel_advice;
        this.manager_advice = manager_advice;
    }

    public Aoa_overtime() {
    }
}
