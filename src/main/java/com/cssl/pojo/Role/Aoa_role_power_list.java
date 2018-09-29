package com.cssl.pojo.Role;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by asus on 2018/9/24.
 */
@Getter
@Setter
//角色权限中间表
public class Aoa_role_power_list {
    private int pk_id;
    private Aoa_role_ role_id;
    private Aoa_role_power_list menu_id;
    private boolean is_show;

    public Aoa_role_power_list(Aoa_role_ role_id, Aoa_role_power_list menu_id) {
        this.role_id = role_id;
        this.menu_id = menu_id;
    }

    public Aoa_role_power_list() {
    }
}
