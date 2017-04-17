package com.nmnet.service.impl;

import com.nmnet.mapper.UserMapper;
import com.nmnet.pojo.User;
import com.nmnet.service.HrmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by WayChen on 2017/4/17.
 */

@Service("hrmService")
public class HrmServiceImpl implements HrmService {

    @Autowired
    private UserMapper userMapper;


    public User login(String loginname, String password) {
        return userMapper.selectByLoginNameAndPsw(loginname, password);
    }

    public User findUserById(Integer id) {
        return null;
    }

    public void removeUserById(Integer id) {

    }

    public void modifyUser(User user) {

    }
}
