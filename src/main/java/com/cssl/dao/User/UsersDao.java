package com.cssl.dao.User;

import com.cssl.pojo.User.Aoa_user;
import com.cssl.pojo.User.Aoa_user_login_record;

/**
 * Created by asus on 2018/9/24.
 */
public interface UsersDao {
    public Aoa_user findOneUser(Aoa_user user);
    //登录成功新增登录记录
    public int insertRecord(Aoa_user_login_record record);


}
