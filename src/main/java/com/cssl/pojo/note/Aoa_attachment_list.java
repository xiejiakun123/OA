package com.cssl.pojo.note;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by asus on 2018/9/26.
 */
@Getter
@Setter
public class Aoa_attachment_list {
    private int attachment_id;//附件Id
    private String user_id; //用户id 在没有连接外键只是用来
                                //查询用户表的
    private  String attachment_name;//附件名
    private String  attachment_path; //附件存储路径
    private int attachment_size;//附件大小
    private String attachment_type;//附件类型
    private Date upload_time;//上传时间
    private String model;//所属模块
    private String attachment_shuffix;//附件后缀

    public Aoa_attachment_list(String user_id, String attachment_name, String attachment_path, int attachment_size, String attachment_type, Date upload_time, String model, String attachment_shuffix) {
        this.user_id = user_id;
        this.attachment_name = attachment_name;
        this.attachment_path = attachment_path;
        this.attachment_size = attachment_size;
        this.attachment_type = attachment_type;
        this.upload_time = upload_time;
        this.model = model;
        this.attachment_shuffix = attachment_shuffix;
    }

    public Aoa_attachment_list() {
    }
}
