package com.cssl.pojo.process;

import com.cssl.pojo.User.Aoa_user;
import lombok.Getter;
import lombok.Setter;

/**
 * 离职表
 */
@Getter
@Setter
public class Aoa_resign {
    private int resign_id;
    private String suggest;//申请人的意见及建议
    private Boolean is_finish=false;//是否还有费用报销未完成
    private Aoa_user user;//工作交接人员
    private String nofinish;//未完成事宜
    private String financial_advice;//财务部意见及说明
    private String personnel_advice;//人事部意见及说明
    private String manager_advice;//经理意见及说明
    private Aoa_ProcessList processList;

    public Aoa_resign(String suggest, Boolean is_finish, Aoa_user user, String nofinish, String financial_advice, String personnel_advice, String manager_advice, Aoa_ProcessList processList) {
        this.suggest = suggest;
        this.is_finish = is_finish;
        this.user = user;
        this.nofinish = nofinish;
        this.financial_advice = financial_advice;
        this.personnel_advice = personnel_advice;
        this.manager_advice = manager_advice;
        this.processList = processList;
    }

    public Aoa_resign() {
    }
}
