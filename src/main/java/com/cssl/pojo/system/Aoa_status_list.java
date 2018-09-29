package com.cssl.pojo.system;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by asus on 2018/9/26.
 */
@Getter
@Setter
public class Aoa_status_list {
    private int status_id;// 状态id
    private String status_color;// 状态名称
    private String status_model;// 状态模块
    private String status_name;//状态名称
    private int sort_value;// 状态排序值
    private String sort_precent;//百分比

    public Aoa_status_list() {
    }
}
