package com.cssl.service.task;

import com.cssl.dao.task.TaskDao;
import com.cssl.pojo.task.Aoa_task_user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by asus on 2018/9/28.
 */
@Service
public class TaskService {
    @Autowired
    private TaskDao taskDao;

    public List<Aoa_task_user> cxsk(int uid){
        return taskDao.cxsk(uid);
    }
}
