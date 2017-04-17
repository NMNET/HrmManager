package com.nmnet.service;

import com.nmnet.pojo.User;

/**
 * Created by WayChen on 2017/4/17.
 */
public interface HrmService {

    /**
     * 登录
     *
     * @param loginname
     * @param password
     * @return
     */
    User login(String loginname, String password);

    /**
     * 根据id查询用户
     *
     * @param id
     * @return
     */
    User findUserById(Integer id);

    /**
     * 根据id删除用户
     *
     * @param id
     */
    void removeUserById(Integer id);

    /**
     * 修改用户
     *
     * @param user
     */
    void modifyUser(User user);


}
