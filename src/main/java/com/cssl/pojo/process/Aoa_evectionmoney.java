package com.cssl.pojo.process;

import lombok.Getter;
import lombok.Setter;

/**
 * //出差费用申请表
 */
@Setter
@Getter

public class Aoa_evectionmoney {
    private int evectionmoney_id;
    private double  money;//申请总金额
    private  String name; //关联客户
    private String  manager_advice;//经理意见及说明
    private String financial_advice;//财务部意见及说明
    private Aoa_ProcessList processList;//外键
    private int  pro;//没用

    public Aoa_evectionmoney(double money, String name, String manager_advice, String financial_advice, Aoa_ProcessList processList, int pro) {
        this.money = money;
        this.name = name;
        this.manager_advice = manager_advice;
        this.financial_advice = financial_advice;
        this.processList = processList;
        this.pro = pro;
    }

    public Aoa_evectionmoney() {
    }
}
