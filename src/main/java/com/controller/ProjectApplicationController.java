package com.controller;

import com.entity.Project;
import com.entity.Teacher;
import com.service.ImplProjectAddService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/proApp")
public class ProjectApplicationController {

    @RequestMapping("/application")
    public ModelAndView app(){
        ModelAndView modelAndView=new ModelAndView("/proMis/application");
        return modelAndView;
    }

    @Autowired
    private ImplProjectAddService projectAddService;
    @RequestMapping("/addAction")
    public ModelAndView appAction(Project project, HttpSession session){
        ModelAndView modelAndView=new ModelAndView("/proMis/application");
        Teacher teacher =(Teacher) session.getAttribute("teacher");
        project.setDeclarerTeacherNum(teacher.getNumber());
        projectAddService.add(project);
        return modelAndView;
    }
}
