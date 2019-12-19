package com.controller;

import com.dao.TeacherMapper;
import com.dto.TeaAndDep;
import com.entity.Teacher;
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
    ImplTeacherService teacherService;

    /**
     * 检查工号合法性
     * @param teaAndDep
     * @return json
     */
    @RequestMapping(value = "/checkNum",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject checkNum(@RequestParam("teaAndDep")TeaAndDep teaAndDep){
        JSONObject jsonObject=new JSONObject();
        if(teaAndDep.getNumber()!=null){
            //有传工号
            if(teacherService.checkTeaNum(teaAndDep.getNumber())){
                //工号合法
                jsonObject.put("tip","工号可以使用");
                jsonObject.put("code","001");
            }else {
                jsonObject.put("tip","工号已被分配");
                jsonObject.put("code","002");
            }
        }else {
            //没有工号
            jsonObject.put("tip","工号是必填项");
            jsonObject.put("code","003");
        }
        return jsonObject;
    }

    /**
     * 保存数据
     * @param teaAndDep
     * @return
     */
    @RequestMapping(value = "/addAction")
    @ResponseBody
    public JSONObject addAction(@RequestParam("teaAndDep")TeaAndDep teaAndDep){
        JSONObject jsonObject=new JSONObject();
        if(teaAndDep.getNumber()==null
                ||teaAndDep.getPassword()==null
                ||teaAndDep.getName()==null
                ||teaAndDep.getAssessor()==null
                ||teaAndDep.getTitle()==null
                ||teaAndDep.getTeaDepNum()==null
                ||teaAndDep.getTeaJob()==null
        ){
            //有必填项没填
            jsonObject.put("msg","有必填项目没有被填写");
            jsonObject.put("code",004);
        }

        return jsonObject;
    }
}
