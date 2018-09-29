package com.cssl.pojo.system;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by asus on 2018/9/24.
 */
@Getter
@Setter
public class Aoa_sys_menu {
    private int  menu_id;// 菜单id
    private int parent_id;//父菜单Id;
    private  String menu_name;//菜单名字
    private String menu_url;//菜单连接
    private  String menu_icon;//菜单图标
    private int sort_id;//菜单排序Id
    private boolean is_show;//是否显示菜单
    private int menu_grade;//权限分数

    public Aoa_sys_menu(int parent_id, String menu_name, String menu_url, String menu_icon, int sort_id, boolean is_show, int menu_grade) {
        this.parent_id = parent_id;
        this.menu_name = menu_name;
        this.menu_url = menu_url;
        this.menu_icon = menu_icon;
        this.sort_id = sort_id;
        this.is_show = is_show;
        this.menu_grade = menu_grade;
    }

    public Aoa_sys_menu() {
    }
}
