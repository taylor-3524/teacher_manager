package com.service.impl;

import com.dao.DepartmentMapper;
import com.dao.TeacherMapper;
import com.dto.TeaAndDep;
import com.entity.Department;
import com.entity.Teacher;
import com.service.ImplTeaAndDepService;
import org.springframework.beans.factory.annotation.Autowired;

public class TeaAndDepService implements ImplTeaAndDepService {
    @Autowired
    private TeacherMapper teacherMapper;
    @Autowired
    private DepartmentMapper departmentMapper;
    /**
     * 对TeaAndDep拆分为Teacher和Deparment并存储
     * @param teaAndDep
     * @return
     */
    @Override
    public boolean addAction(TeaAndDep teaAndDep) {
        //必须先插入teacher后插入department，否则会引起外键问题
        Teacher teacher=new Teacher();
        Department department=new Department();

        teacher.setName(teaAndDep.getName());
        teacher.setPassword(teaAndDep.getPassword());
        teacher.setAssessor(teaAndDep.getAssessor());
        teacher.setNumber(teaAndDep.getNumber());
        teacher.setTitle(teaAndDep.getTitle());
        if (teaAndDep.getPhone()!=null){
            //有手机号
            teacher.setPhone(teaAndDep.getPhone());
            teacherMapper.insert(teacher);
        }else{
            //没手机号
            teacherMapper.insertSelective(teacher);
        }

        department.setTeaDepNum(teaAndDep.getTeaDepNum());
        department.setTeaJob(teaAndDep.getTeaJob());
        departmentMapper.insert(department);


        return true;
    }
}
