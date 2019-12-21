package com.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;

public class LoginInterceptor implements HandlerInterceptor {
    /**
     * 负责权限验证，防止用户直接输入url访问
     *
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String nowUrl = httpServletRequest.getRequestURI();

        if (nowUrl.equals("/teacher_manager_system_war_exploded/")
                || nowUrl.equals("/teacher_manager_system_war_exploded/login/index")
                || nowUrl.equals("/teacher_manager_system_war_exploded/login/login")
        ) {
            //放行登录页面
            return true;
        } else {
            //不是登录页面
            if (httpServletRequest.getSession().getAttribute("teacher") != null) {
                //已登录
                return true;
            }
        }
        httpServletResponse.sendRedirect("../login/index");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
