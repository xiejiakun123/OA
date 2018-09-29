package com.cssl.pojo.File;

import com.cssl.pojo.User.Aoa_user;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by asus on 2018/9/26.
 */
@Getter
@Setter
public class Aoa_file_path {
    private int path_id;
    private int parent_id;
    private String path_name;
    private int path_istrash;
    private Aoa_user user;


}
