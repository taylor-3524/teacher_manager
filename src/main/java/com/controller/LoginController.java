package com.controller;

import com.entity.Teacher;
import com.service.ILoginService;
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
    private ILoginService loginService;

    public String login(
            @RequestParam(value = "username",required = true)String username,
            @RequestParam(value = "password",required = true)String password,
            HttpSession session
    ){
        Teacher teacher=new Teacher();
        teacher.setName(username);
        teacher.setPassword(password);
        if(loginService.cheakuser(teacher)){
            //密码正确
            session.setAttribute("teacher",teacher);
            return "forward:/index/index";
        }
        else{
            //密码错误
            return "forward:/login/error";
        }
    }
}