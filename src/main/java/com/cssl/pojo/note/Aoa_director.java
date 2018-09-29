package com.cssl.pojo.note;

import com.cssl.pojo.User.Aoa_user;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by asus on 2018/9/26.
 */
@Setter
@Getter
public class Aoa_director {
    private int director_id;
    private String user_name;
    private String pinyin;
    private  String sex;
    private String phone_number;
    private String image_path;
    private String remark;
    private String address;
    private Aoa_user user;

    public Aoa_director(String user_name, String pinyin, String sex, String phone_number, String image_path, String remark, String address, Aoa_user user) {
        this.user_name = user_name;
        this.pinyin = pinyin;
        this.sex = sex;
        this.phone_number = phone_number;
        this.image_path = image_path;
        this.remark = remark;
        this.address = address;
        this.user = user;
    }

    public Aoa_director() {
    }
}
