package com.nmnet.interceptor;

import com.nmnet.pojo.User;
import com.nmnet.util.common.HrmConstants;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by NMNET on 2017/3/31.
 */
public class AuthorizedInterceptor implements HandlerInterceptor {

    //    定义不需要拦截的请求
    private static final String[] IGNORE_URI = {"/loginForm", "/login", "/404.html"};

    /**
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @return false表示不拦截，此次请求就结束了，true表示拦截，接下来会走下面两个方法
     * @throws Exception
     */
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        //默认没有登录，进行拦截
        boolean flag = false;
        String servletPath = httpServletRequest.getServletPath();
        for (String s : IGNORE_URI) {
            if (servletPath.contains(s)) {
                flag = true;
                break;
            }
        }

        //拦截请求
        if (!flag) {
            //获取session中的用户
            User user = (User) httpServletRequest.getSession().getAttribute(HrmConstants.USER_SESSION);
            if (user == null) {
                httpServletRequest.setAttribute("message", "请先登录再访问网站");
                httpServletRequest.getRequestDispatcher(HrmConstants.LOGIN).forward(httpServletRequest, httpServletResponse);
                return flag;
            } else {
                flag = true;
            }
        }
        return flag;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
