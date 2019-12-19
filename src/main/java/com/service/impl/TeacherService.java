package com.service.impl;

import com.dao.TeacherMapper;
import com.entity.Teacher;
import com.entity.TeacherExample;
import com.service.ImplTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherService implements ImplTeacherService {
    /**
     * 检查教师工号是否已存在
     * @param Number
     * @return
     */
    @Autowired
    private TeacherMapper teacherMapper;
    @Override
    public boolean checkTeaNum(Integer number) {
        TeacherExample teacherExample=new TeacherExample();
        teacherExample.createCriteria().andNumberEqualTo(number);
        List<Teacher> list=teacherMapper.selectByExample(teacherExample);
        if (list.isEmpty()){
            //数据库没有这个编号
            return true;
        }
        return false;
    }
}
