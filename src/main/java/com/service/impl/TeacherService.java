package com.service.impl;

import com.dao.TeacherMapper;
import com.entity.Teacher;
import com.entity.TeacherExample;
import com.service.ImplTeacherService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService implements ImplTeacherService {
    /**
     * 检查教师工号是否已存在
     *
     * @param Number
     * @return json
     */
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public JSONObject checkTeaNum(Integer number) {
        JSONObject jsonObject = new JSONObject();
        if (number != null) {
            TeacherExample teacherExample = new TeacherExample();
            teacherExample.createCriteria().andNumberEqualTo(number);
            List<Teacher> list = teacherMapper.selectByExample(teacherExample);
            if (list.isEmpty()) {
                //数据库没有这个编号
                jsonObject.put("msg", "工号可以使用");
                jsonObject.put("success","success");
                jsonObject.put("code", "001");
            } else {
                jsonObject.put("msg", "工号已被分配");
                jsonObject.put("success","error");
                jsonObject.put("code", "002");
            }
        } else {
            //没有工号
            jsonObject.put("msg", "");
            jsonObject.put("success","error");
            jsonObject.put("code", "003");
        }
        return jsonObject;
    }
}
