package com.cssl.pojo.User;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by asus on 2018/9/24.
 */
@Getter
@Setter
//部门表
public class Aoa_dept {
    private int dept_id;
    private String dept_name;
    private String dept_tel;
    private String dept_fax;
    private String email;
    private String dept_addr;
    private int deptmanager;
    private Date start_time;//上班时间
    private Date end_time;//下班时间

    public Aoa_dept(String dept_name, String dept_tel, String dept_fax, String email, String dept_addr, int deptmanager, Date start_time, Date end_time) {
        this.dept_name = dept_name;
        this.dept_tel = dept_tel;
        this.dept_fax = dept_fax;
        this.email = email;
        this.dept_addr = dept_addr;
        this.deptmanager = deptmanager;
        this.start_time = start_time;
        this.end_time = end_time;
    }

    public Aoa_dept() {
    }
}
