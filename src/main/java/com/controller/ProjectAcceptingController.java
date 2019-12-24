package com.controller;

import com.dto.ProAndTea;
import com.entity.Project;
import com.service.ImplProjectUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/proAcc")
public class ProjectAcceptingController {
    @Autowired
    private ImplProjectUpdateService projectUpdateService;


    @RequestMapping("/accepting")
    public ModelAndView acc() {
        ModelAndView modelAndView = new ModelAndView("/proMis/accepting");
        List<ProAndTea> list = projectUpdateService.getProAndTeaInfo();
        modelAndView.addObject("data", list);
        return modelAndView;
    }
    @RequestMapping("/approval")
    public ModelAndView app() {
        ModelAndView modelAndView = new ModelAndView("/proMis/accepting");
        List<ProAndTea> list = projectUpdateService.getProAndTeaInfo();
        modelAndView.addObject("data", list);
        return modelAndView;
    }

    @RequestMapping("/updateAction")
    public ModelAndView updateAction(Project project) {
        ModelAndView modelAndView = new ModelAndView("/proMis/accepting");
        List<ProAndTea> list = projectUpdateService.getProAndTeaInfo();
        projectUpdateService.updateProjectInfo(project);
        modelAndView.addObject("data",list);
        return modelAndView;
    }


}
