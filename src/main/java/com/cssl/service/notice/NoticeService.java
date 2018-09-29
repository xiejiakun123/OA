package com.cssl.service.notice;

import com.cssl.dao.notice.NoticeDao;
import com.cssl.pojo.notice.Aoa_notice_user_relation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by asus on 2018/9/28.
 */
@Service
public class NoticeService {
    @Autowired
    NoticeDao noticeDao;
    public List<Aoa_notice_user_relation> cxjl(int uid){
        return noticeDao.cxjl(uid);
    }


}
