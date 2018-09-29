package com.cssl.dao.role;

import com.cssl.pojo.User.Aoa_user;
import com.cssl.pojo.system.Aoa_sys_menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by asus on 2018/9/24.
 */
public interface RolepowerlistDao {
    //查询所有父菜单
    public List<Aoa_sys_menu>  findbyparentall(int id);
    //查询所有子菜单
    public List<Aoa_sys_menu> findbyparentsxian(int id);
    //条件查询父菜单
    public List<Aoa_sys_menu>  findfcd(@Param("id") int id,@Param("menu_name") String name);
    //条件查询子菜单
    public List<Aoa_sys_menu>  findzcd(@Param("id") int id,@Param("parent_id") int pid);



}
