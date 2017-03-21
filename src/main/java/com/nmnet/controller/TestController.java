package com.nmnet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by NMNET on 2017/3/14 0014.
 */

@Controller
public class TestController {

    @RequestMapping("{viewName}")
    public ModelAndView test(@PathVariable("viewName") String viewName) {
        ModelAndView mv = new ModelAndView(viewName);
        return mv;
    }

}
