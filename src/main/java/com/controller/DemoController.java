package com.controller;

import com.entity.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/demo")
public class DemoController {
    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView=new ModelAndView("demo/index");
        Teacher teacher=new Teacher();
        teacher.setNumber(1);
        teacher.setName("ywz");
        teacher.setPhone("16446");
        modelAndView.addObject(teacher);
        return modelAndView;

    }
}
