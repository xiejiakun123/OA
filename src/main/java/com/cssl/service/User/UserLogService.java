package com.cssl.service.User;

import com.cssl.dao.User.UserLogDao;
import com.cssl.pojo.User.Aoa_user_log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by asus on 2018/9/28.
 */
@Service
public class UserLogService {
    @Autowired
    private UserLogDao userLogDao;

  public   List<Aoa_user_log> cxlg(int uid){
        return userLogDao.cxlg(uid);
    }

}
