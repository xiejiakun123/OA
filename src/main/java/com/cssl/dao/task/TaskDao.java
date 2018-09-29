package com.cssl.dao.task;

import com.cssl.pojo.task.Aoa_task_user;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by asus on 2018/9/28.
 */
public interface TaskDao {
    public List<Aoa_task_user> cxsk(@Param("uid") int uid);

}
