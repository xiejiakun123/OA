package com.cssl.dao.User;

import com.cssl.pojo.User.Aoa_user_log;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by asus on 2018/9/28.
 */
public interface UserLogDao {
  public   List<Aoa_user_log>  cxlg(@Param("uid") int uid);


}
