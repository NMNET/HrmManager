package com.nmnet.controller;

import com.nmnet.pojo.User;
import com.nmnet.service.HrmService;
import com.nmnet.util.common.HrmConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Created by WayChen on 2017/4/17.
 */

@Controller
public class UserController {

    @Qualifier("hrmService")
    @Autowired
    private HrmService hrmService;

    @RequestMapping(value = "/login")
    public ModelAndView login(@RequestParam("loginname") String loginname,
                              @RequestParam("password") String password,
                              HttpSession session, ModelAndView mv) {
        User user = hrmService.login(loginname, password);
        if (user != null) {
            session.setAttribute(HrmConstants.USER_SESSION, user);
            mv.setViewName("redirect:/main");
        } else {
            mv.addObject("message", "用户名或密码错误，请重新输入");
            mv.setViewName("forward:/loginForm");
        }
        return mv;
    }

    @RequestMapping(value = "user/AddUser")
    public ModelAndView addUser(String flag,
                                @ModelAttribute User user,
                                ModelAndView mv) {

        mv.setViewName("user/showAddUser");

        return mv;
    }


}
