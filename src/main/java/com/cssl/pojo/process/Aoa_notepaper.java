package com.cssl.pojo.process;

import com.cssl.pojo.User.Aoa_user;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 便签表
 */
@Getter
@Setter
public class Aoa_notepaper {
    private int notepaper_id;
    private String title;				//便签标题
    private String concent; //便签内容
    private Aoa_user user;  //编写便签的用户
    private Date create_time;   //便签创建时间

    public Aoa_notepaper(String title, String concent, Aoa_user user, Date create_time) {
        this.title = title;
        this.concent = concent;
        this.user = user;
        this.create_time = create_time;
    }

    public Aoa_notepaper() {
    }
}
