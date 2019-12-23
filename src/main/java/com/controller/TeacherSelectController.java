package com.controller;

import com.dto.TeaAndDep;
import com.entity.Teacher;
import com.service.ImplTeacherSelectService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/teaSel")
public class TeacherSelectController {
    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView=new ModelAndView("/teaMis/select");
        return modelAndView;
    }

    @Autowired
    private ImplTeacherSelectService teacherSelectService;

    /**
     * 根据名字查找老师信息
     * @param name
     * @return dto
     */

    @RequestMapping("/selectByName")

    public ModelAndView selectByName(@RequestParam(value = "name")String name){
        ModelAndView modelAndView=new ModelAndView("teaMis/selectRes");
        List<Teacher> list=teacherSelectService.selectByName(name);
        modelAndView.addObject("data",list);
        return modelAndView;
    }

    @Autowired
    private TeaAndDep teaAndDep;

    @RequestMapping("/selectByDepAndJob")
    public ModelAndView selectByDepAndJob(TeaAndDep teaAndDep){
        ModelAndView modelAndView=new ModelAndView("teaMis/selectRes");
        JSONObject jsonObject=teacherSelectService.selectByDepAndJob(teaAndDep);
        modelAndView.addObject("msg",jsonObject);

        return modelAndView;
    }

/*    @RequestMapping("/selectByDepAndJob")
    @ResponseBody
    public JSONObject selectByDepAndJob(
            @RequestParam(value = "teaDepNum")Integer teaDepNum,
            @RequestParam(value = "teaJob")String teaJob
            ){
        JSONObject msg=teacherSelectService.selectByDepAndJob(teaDepNum,teaJob);
        return msg;

    }*/


}
