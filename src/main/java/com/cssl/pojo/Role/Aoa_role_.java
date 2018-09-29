package com.cssl.pojo.Role;

import lombok.Getter;
import lombok.Setter;
import retrofit2.http.GET;

/**
 * Created by asus on 2018/9/24.
 */
@Getter
@Setter
public class Aoa_role_ {
    private int role_id;
    private String role_name;
    private int role_value;

    public Aoa_role_(String role_name, int role_value) {
        this.role_name = role_name;
        this.role_value = role_value;
    }

    public Aoa_role_() {
    }
}
