package com.cssl.pojo.schedule;

import com.cssl.pojo.User.Aoa_user;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by asus on 2018/9/27.
 */
@Getter
@Setter
public class Aoa_schedule_list {
    private int  rc_id;
    private int type_id;
    private int status_id;
    private Date start_time;
    private Date end_time;
    private Date create_time=new Date();
    private String title;	//日程标题
    private String miaoshu;//描述
    private boolean is_remind=false;//是否提醒
    private Aoa_user user;//用户
    private Boolean isreminded = false;
    private String filedescribe;//没卵用的列



}
