package com.cssl.pojo.attandce;

import com.cssl.pojo.User.Aoa_user;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by asus on 2018/9/26.
 */
@Getter
@Setter

/*考勤表*/
public class Aoa_attends_list {
    private int attends_id;//考勤主键
    private int type_id;//类型Id
    private String attends_remark;//考勤备注
    private Date attends_time;//考勤时间
    private Date attend_hmtime;//考勤时分
    private String week_ofday;//星期几
    private String attends_ip;//登陆Ip
    private Date holiday_start;//请假开始时间
    private Double holiday_days;//请假次数
    private Aoa_user user;//用户外键

    public Aoa_attends_list(int type_id, String attends_remark, Date attends_time, Date attend_hmtime, String week_ofday, String attends_ip, Date holiday_start, Double holiday_days, Aoa_user user) {
        this.type_id = type_id;
        this.attends_remark = attends_remark;
        this.attends_time = attends_time;
        this.attend_hmtime = attend_hmtime;
        this.week_ofday = week_ofday;
        this.attends_ip = attends_ip;
        this.holiday_start = holiday_start;
        this.holiday_days = holiday_days;
        this.user = user;
    }

    public Aoa_attends_list() {
    }
}
