package com.cssl.pojo.process;

import com.cssl.pojo.User.Aoa_user;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 住宿申请表
 */
@Getter
@Setter
public class Aoa_stay {
    private int stay_id;
    private Aoa_user user;//出差人员
    private Date stay_time;//入住时间
    private Date leave_time;//离店时间
    private String stay_city;//入住城市
    private String hotel_namel;//入住酒店
    private Integer day;//入住天数
    private Double stay_money;//酒店标准
    private Aoa_evectionmoney evectionmoney;//报销外键

    public Aoa_stay(Aoa_user user, Date stay_time, Date leave_time, String stay_city, String hotel_namel, Integer day, Double stay_money, Aoa_evectionmoney evectionmoney) {
        this.user = user;
        this.stay_time = stay_time;
        this.leave_time = leave_time;
        this.stay_city = stay_city;
        this.hotel_namel = hotel_namel;
        this.day = day;
        this.stay_money = stay_money;
        this.evectionmoney = evectionmoney;
    }

    public Aoa_stay() {
    }
}
