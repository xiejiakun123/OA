package com.cssl.dao.notice;

import com.cssl.pojo.notice.Aoa_notice_user_relation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by asus on 2018/9/28.
 */
public interface NoticeDao {
    public List<Aoa_notice_user_relation>  cxjl(@Param("uid") int uid);

}
