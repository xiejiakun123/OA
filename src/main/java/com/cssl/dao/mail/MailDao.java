package com.cssl.dao.mail;

import com.cssl.pojo.mail.Aoa_mail_reciver;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by asus on 2018/9/28.
 */
public interface MailDao {
    public List<Aoa_mail_reciver> cxyx(@Param("uid") int uid);


}
