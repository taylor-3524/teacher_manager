package com.service.impl;

import com.dao.TeacherMapper;
import com.entity.Teacher;
import com.entity.TeacherExample;
import com.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService implements ILoginService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public boolean cheakuser(Teacher teacher) {
        TeacherExample teacherExample=new TeacherExample();
        teacherExample.createCriteria().andNameEqualTo(teacher.getName());
        List<Teacher> list=teacherMapper.selectByExample(teacherExample);

        if(list.isEmpty()){
            //没有这个用户名
            return false;
        }
        return list.get(0).getPassword().equals(teacher.getPassword());
    }
}
