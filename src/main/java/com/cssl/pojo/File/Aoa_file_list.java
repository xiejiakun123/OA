package com.cssl.pojo.File;

import com.cssl.pojo.User.Aoa_user;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by asus on 2018/9/26.
 */
@Getter
@Setter
public class Aoa_file_list {
    private  int file_id;
    private String file_name;//文件名
    private String file_path;//文件路径
    private int size;//大小
    private String content_type;//类型
    private Date upload_time;//上传时间
    private String model;//所属模块
    private String file_shuffix;//文件后缀名
    private int file_istrash;
    private int file_isshare;
    private Aoa_user user;
    private Aoa_file_path path;




}
