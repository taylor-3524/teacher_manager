package com.service.impl;

import com.dao.DepartmentMapper;
import com.dao.TeaAndDepMapper;
import com.dao.TeacherMapper;
import com.dto.TeaAndDep;
import com.entity.Department;
import com.entity.DepartmentExample;
import com.entity.Teacher;
import com.entity.TeacherExample;
import com.service.ImplTeacherSelectService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherSelectService implements ImplTeacherSelectService {
    /**
     * 根据名字找老师
     * @param name
     * @return json格式的dto
     */

    @Autowired
    private TeacherMapper teacherMapper;
    @Override
    public List<Teacher> selectByName(String name) {
        TeacherExample teacherExample=new TeacherExample();
        teacherExample.createCriteria().andNameLike("%"+name+"%");
        List<Teacher> list=teacherMapper.selectByExample(teacherExample);
/*        for (Teacher tea_list:list) {
            System.out.println(tea_list.getName());
        }*/

        return list;
    }

    @Autowired
    private TeaAndDepMapper teaAndDepMapper;
    @Autowired
    private TeaAndDep teaAndDep;
    @Autowired
    private DepartmentMapper departmentMapper;
    /**
     * 根据部门和职务找人
     * @return teacher的json
     */
    @Override
    public List<Teacher> selectByDepAndJob(TeaAndDep teaAndDep) {


        DepartmentExample departmentExample=new DepartmentExample();
        departmentExample.createCriteria().andTeaDepNumEqualTo(teaAndDep.getTeaDepNum());
        departmentExample.createCriteria().andTeaJobEqualTo(teaAndDep.getTeaJob());
        List<Department> dep_list=departmentMapper.selectByExample(departmentExample);
        List<Teacher> list=new ArrayList<>();
        for (Department dep:dep_list) {
            TeacherExample teacherExample=new TeacherExample();
            teacherExample.createCriteria().andNumberEqualTo(dep.getTeaNum());
            List<Teacher> list_tmp=teacherMapper.selectByExample(teacherExample);
            if(!list_tmp.isEmpty()){
                list.add(list_tmp.get(0));
            }

        }
        return list;
    }
}
