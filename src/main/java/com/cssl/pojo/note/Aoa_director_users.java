package com.cssl.pojo.note;

import com.cssl.pojo.User.Aoa_user;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by asus on 2018/9/26.
 */
@Getter
@Setter
public class Aoa_director_users {
    private int director_users_id;
    private  Aoa_director director;
    private Aoa_user user;
    private String catelog_name;
    private Aoa_user share_user;
    private Date sharetime=new Date();
    private Boolean is_handle=false;

    public Aoa_director_users(Aoa_director director, Aoa_user user, String catelog_name, Aoa_user share_user, Date sharetime, Boolean is_handle) {
        this.director = director;
        this.user = user;
        this.catelog_name = catelog_name;
        this.share_user = share_user;
        this.sharetime = sharetime;
        this.is_handle = is_handle;
    }

    public Aoa_director_users() {
    }
}
