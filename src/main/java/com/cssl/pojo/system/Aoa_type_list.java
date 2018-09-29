package com.cssl.pojo.system;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by asus on 2018/9/26.
 */
@Getter
@Setter
public class Aoa_type_list {
    private int type_id;//类型Id
    private String type_color;//颜色
    private int sort_value;//排序值
    private String type_name;//类型名字
    private String type_model;//所属模块
}
