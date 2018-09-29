package com.cssl.pojo.User;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by asus on 2018/9/24.
 */
@Getter
@Setter
public class Aoa_position {
    private int position_id;
    private String name;
    private int level;
    private String describtion;
    private  int deptid;

    public Aoa_position(String name, int level, String describtion) {
        this.name = name;
        this.level = level;
        this.describtion = describtion;
    }

    public Aoa_position() {
    }
}
