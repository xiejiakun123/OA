package com.cssl.pojo.process;

import lombok.Getter;
import lombok.Setter;

/**
 * 转正表
 */
@Getter
@Setter
public class Aoa_regular {
    private int regular_id;
    private String experience;//试用期/实习期心得体会

    private String understand;//对本岗位职员的要求的理解

    private String  pullulate;//试用期/实习期在哪些方面有了成长

    private String deficiency;//目前存在的不足

    private String dobetter;//如何在本岗位作得更好

    private String advice;//对公司产品的意见及建议

    private Double days;//实习天数
    private String personnel_advice;
    private String manager_advice;
    private Aoa_ProcessList processList;

    public Aoa_regular(String experience, String understand, String pullulate, String deficiency, String dobetter, String advice, Double days, String personnel_advice, String manager_advice, Aoa_ProcessList processList) {
        this.experience = experience;
        this.understand = understand;
        this.pullulate = pullulate;
        this.deficiency = deficiency;
        this.dobetter = dobetter;
        this.advice = advice;
        this.days = days;
        this.personnel_advice = personnel_advice;
        this.manager_advice = manager_advice;
        this.processList = processList;
    }

    public Aoa_regular() {
    }
}
