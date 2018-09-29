package com.cssl.pojo.process;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 报销费用明细表
 */
@Getter
@Setter
public class Aoa_detailsburse {
    private int detailsburse_id;
    private Date produceTime;//费用产生时间

    private String 	subject;//费用产生科目

    private String descript;//费用说明

    private Integer invoices ;//票据张数

    private double detailmoney;//报销金额

    private Aoa_bursement bursement;//对应报销表

}
