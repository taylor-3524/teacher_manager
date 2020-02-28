package com.controller;

import com.dto.TeaAndDep;
import com.service.ImplTeacherAddService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/teaAdd")
public class TeacherAddController {


    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("teaMis/add");
        return modelAndView;
    }



    @Autowired
    private ImplTeacherAddService teacherAddService;

    /**
     * 检查工号合法性
     * @param number
     * @return json
     */
    @RequestMapping(value = "/checkNum")
    @ResponseBody
    public JSONObject checkNum(@RequestParam(value = "number")Integer number){
        JSONObject jsonObject=teacherAddService.checkTeaNum(number);
        return jsonObject;
    }


    /**
     * 保存数据
     * @param teaAndDep
     * @return json
     */
    @RequestMapping(value = "/addAction")
    public ModelAndView addAction(TeaAndDep teaAndDep){
        ModelAndView modelAndView=new ModelAndView("teaMis/add");
        JSONObject jsonObject=teacherAddService.addAction(teaAndDep);
        modelAndView.addObject("add_msg",jsonObject);
        return modelAndView;
    }
}
