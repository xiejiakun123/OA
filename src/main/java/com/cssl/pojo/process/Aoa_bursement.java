package com.cssl.pojo.process;

import com.cssl.pojo.User.Aoa_user;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * //费用报销表
 */
@Getter
@Setter
public class Aoa_bursement {
    private int  bursement_id;
    private Double all_money;//金额
    private  int allinvoices;//票据总数
    private Aoa_user operation_name;//报销人员
    private Aoa_user user_name;//证明人
    private String name;//相关客户
    private Date burseTime;//报销日期
    private String manager_advice;//经理意见及说明
    private String financial_advice;//财务部意见及说明
    private Aoa_ProcessList processList;


    public Aoa_bursement(Double all_money, int allinvoices, Aoa_user operation_name, Aoa_user user_name, String name, Date burseTime, String manager_advice, String financial_advice, Aoa_ProcessList processList) {
        this.all_money = all_money;
        this.allinvoices = allinvoices;
        this.operation_name = operation_name;
        this.user_name = user_name;
        this.name = name;
        this.burseTime = burseTime;
        this.manager_advice = manager_advice;
        this.financial_advice = financial_advice;
        this.processList = processList;
    }

    public Aoa_bursement() {
    }
}
