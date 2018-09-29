package com.cssl.service.mail;

import com.cssl.dao.mail.MailDao;
import com.cssl.pojo.mail.Aoa_mail_reciver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by asus on 2018/9/28.
 */
@Service
public class MailService {
    @Autowired
    private    MailDao mailDao;
    public List<Aoa_mail_reciver> cxyx(int uid){
      return  mailDao.cxyx(uid);
    }

}
