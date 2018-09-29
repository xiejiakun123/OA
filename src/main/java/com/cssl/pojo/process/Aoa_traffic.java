package com.cssl.pojo.process;

import com.cssl.pojo.User.Aoa_user;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 交通费用明细表
 */
@Getter
@Setter
public class Aoa_traffic {
    private int traffic_id;
    private Aoa_user user;
    private Date depart_time;
    private String depart_name;
    private String reach_name;
    private String traffic_name;
    private String seat_type;
    private Double traffic_money;
    private Aoa_evection evection;

    public Aoa_traffic(Aoa_user user, Date depart_time, String depart_name, String reach_name, String traffic_name, String seat_type, Double traffic_money, Aoa_evection evection) {
        this.user = user;
        this.depart_time = depart_time;
        this.depart_name = depart_name;
        this.reach_name = reach_name;
        this.traffic_name = traffic_name;
        this.seat_type = seat_type;
        this.traffic_money = traffic_money;
        this.evection = evection;
    }

    public Aoa_traffic() {
    }
}
