package com.service.impl;

import com.dao.TeaAndDepMapper;
import com.dao.TeaAndDepPlusMapper;
import com.dao.TeacherMapper;
import com.dto.TeaAndDep;
import com.dto.TeaAndDepPlus;
import com.entity.Teacher;
import com.entity.TeacherExample;
import com.service.ImplTeacherUpdateService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherUpdateService implements ImplTeacherUpdateService {
    @Autowired
    private TeaAndDepPlusMapper teaAndDepPlusMapper;


    @Override
    public List<TeaAndDepPlus> getPersonInf(Teacher teacher) {
        List<TeaAndDepPlus> list=teaAndDepPlusMapper.selectByTeaNumber(teacher);


        return list;
    }
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public void updateTeacherInf(Teacher teacher) {
        Integer number=teacher.getNumber();
        TeacherExample teacherExample=new TeacherExample();
        teacherExample.createCriteria().andNumberEqualTo(number);
        teacherMapper.updateByExampleSelective(teacher,teacherExample);

    }

}
