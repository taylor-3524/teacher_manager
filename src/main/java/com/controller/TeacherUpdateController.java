package com.controller;

import com.dto.TeaAndDep;
import com.dto.TeaAndDepPlus;
import com.entity.Teacher;
import com.service.ImplTeacherSelectService;
import com.service.ImplTeacherUpdateService;
import com.service.impl.TeacherSelectService;
import com.service.impl.TeacherUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/teaUpd")
public class TeacherUpdateController {
    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView=new ModelAndView("teaMis/update");
        return modelAndView;
    }
    @Autowired
    private ImplTeacherSelectService teacherSelectService;

    @RequestMapping("/selectByDepAndJob")
    public ModelAndView selectByDepAndJob(TeaAndDep teaAndDep){
        ModelAndView modelAndView=new ModelAndView("teaMis/updateRes");
        List<Teacher> list=teacherSelectService.selectByDepAndJob(teaAndDep);
        modelAndView.addObject("data",list);
        return modelAndView;
    }

    @Autowired
    private ImplTeacherUpdateService teacherUpdateService;
    @RequestMapping("/updateGetPerson")
    private ModelAndView updateGetPerson(Teacher teacher){
        ModelAndView modelAndView=new ModelAndView("teaMis/updatePerson");
        List<TeaAndDepPlus> list=teacherUpdateService.getPersonInf(teacher);
        modelAndView.addObject("data",list);
        return modelAndView;
    }

    @RequestMapping("/update")
    public ModelAndView update(Teacher teacher){
        ModelAndView modelAndView=new ModelAndView("teaMis/index");
        teacherUpdateService.updateTeacherInf(teacher);
        return modelAndView;
    }


}
