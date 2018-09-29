package com.cssl.service.User;

import com.cssl.dao.User.UsersDao;
import com.cssl.pojo.User.Aoa_user;
import com.cssl.pojo.User.Aoa_user_login_record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by asus on 2018/9/24.
 */
@Service
public class UserService {
    @Autowired
    private UsersDao usersDao;

    public Aoa_user findOneUser(Aoa_user user){
        return  usersDao.findOneUser(user);
    }

    public int saveLogionRecord(Aoa_user_login_record record){
        return usersDao.insertRecord(record);
    }

}
