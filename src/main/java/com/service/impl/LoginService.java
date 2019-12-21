package com.service.impl;

import com.dao.TeacherMapper;
import com.entity.Teacher;
import com.entity.TeacherExample;
import com.service.ImplLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class LoginService implements ImplLoginService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public void checkuser(Teacher teacher, HttpSession session) {
        TeacherExample teacherExample=new TeacherExample();
        teacherExample.createCriteria().andNameEqualTo(teacher.getName());
        List<Teacher> list=teacherMapper.selectByExample(teacherExample);

        if(!list.isEmpty()){
            //有这个用户名
            if(list.get(0).getPassword().equals(teacher.getPassword())){
                session.setAttribute("teacher",teacher);
            }
        }

    }
}
