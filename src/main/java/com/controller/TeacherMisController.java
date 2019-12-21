package com.controller;

import com.dao.TeacherMapper;
import com.dto.TeaAndDep;
import com.entity.Teacher;
import com.service.ImplTeaAndDepService;
import com.service.ImplTeacherService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/teaMis")
public class TeacherMisController {

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("/teaMis/index");
        return modelAndView;
    }
    @RequestMapping("/add")
    public ModelAndView add(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("/teaMis/add");
        return modelAndView;
    }


    @Autowired
    private ImplTeacherService teacherService;

    /**
     * 检查工号合法性
     * @param number
     * @return json
     */
    @RequestMapping(value = "/checkNum")
    @ResponseBody
    public JSONObject checkNum(@RequestParam(value = "number")Integer number){
        JSONObject jsonObject=teacherService.checkTeaNum(number);
        return jsonObject;
    }

    @Autowired
    private ImplTeaAndDepService teaAndDepService;
    /**
     * 保存数据
     * @param teaAndDep
     * @return json
     */
    @RequestMapping(value = "/addAction")
    public ModelAndView addAction(TeaAndDep teaAndDep){
        ModelAndView modelAndView=new ModelAndView("teaMis/add");
        JSONObject jsonObject=teaAndDepService.addAction(teaAndDep);
        modelAndView.addObject("add_msg",jsonObject);
        return modelAndView;
    }
}
