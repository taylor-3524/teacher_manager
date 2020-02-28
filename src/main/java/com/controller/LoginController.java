package com.controller;

import com.entity.Teacher;
import com.service.ImplLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("/login/index");
        return modelAndView;
    }

    @Autowired
    private ImplLoginService loginService;

    /**
     * 登录模块
     * Teacher
     * @param session
     * @return
     */
    @RequestMapping("/login")
    public String login(Teacher teacher, HttpSession session){
        loginService.checkuser(teacher, session);
            //密码正确
            return "index/index";
    }


    /**
     * 注销登录
     * @param session
     * @return
     */
    @RequestMapping("/lgout")
    public String lgout(HttpSession session){
        if (!session.getAttribute("teacher").equals(null)){
            session.removeAttribute("teacher");
            return "forward:/login/index";
        }else {
            return "forward:/login/error";
        }
    }

}
