package com.nmnet.mapper;

import com.nmnet.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by WayChen on 2017/4/17.
 */
public interface UserMapper {

    User selectByLoginNameAndPsw(@Param("loginname") String loginname, @Param("password") String password);

    User selectById(Integer id);

    Integer deleteById(Integer id);

    Integer update(User user);

}
