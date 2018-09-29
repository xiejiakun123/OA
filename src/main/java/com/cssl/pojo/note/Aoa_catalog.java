package com.cssl.pojo.note;

import com.cssl.pojo.User.Aoa_user;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by asus on 2018/9/27.
 */
@Getter
@Setter
public class Aoa_catalog {
    private int catalog_id;
    private String catalog_name;
    private Aoa_user user;
    private int  parent_id;

    public Aoa_catalog(String catalog_name, Aoa_user user, int parent_id) {
        this.catalog_name = catalog_name;
        this.user = user;
        this.parent_id = parent_id;
    }

    public Aoa_catalog() {
    }
}
