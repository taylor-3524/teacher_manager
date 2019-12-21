package com.service.impl;

import com.dao.DepartmentMapper;
import com.dao.TeacherMapper;
import com.dto.TeaAndDep;
import com.entity.Department;
import com.entity.Teacher;
import com.entity.TeacherExample;
import com.service.ImplTeacherAddService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherAddService implements ImplTeacherAddService {
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

    @Autowired
    private DepartmentMapper departmentMapper;
    /**
     * 对TeaAndDep拆分为Teacher和Deparment并存储
     * @param teaAndDep
     * @return
     */
    @Override
    public JSONObject addAction(TeaAndDep teaAndDep) {
        JSONObject jsonObject=new JSONObject();
        if(teaAndDep.getNumber()==null
                ||teaAndDep.getPassword()==null
                ||teaAndDep.getName()==null
        ){
            //有必填项没填
            jsonObject.put("msg","有必填项目没有被填写");
            jsonObject.put("success","error");
            jsonObject.put("code",004);
            return jsonObject;
        }
        //必须先插入teacher后插入department，否则会引起外键问题
        Teacher teacher=new Teacher();
        Department department=new Department();

        teacher.setName(teaAndDep.getName());
        teacher.setPassword(teaAndDep.getPassword());
        teacher.setAssessor(teaAndDep.getAssessor());
        teacher.setNumber(teaAndDep.getNumber());
        teacher.setTitle(teaAndDep.getTitle());
        teacher.setTenure(teaAndDep.getTenure());
        int flag;
        if (teaAndDep.getPhone()!=null){
            //有手机号
            teacher.setPhone(teaAndDep.getPhone());
            flag=teacherMapper.insert(teacher);
        }else{
            //没手机号
            flag=teacherMapper.insertSelective(teacher);
        }
        System.out.println("teacher_flag:"+flag);
        department.setTeaNum(teaAndDep.getNumber());
        department.setTeaDepNum(teaAndDep.getTeaDepNum());
        department.setTeaJob(teaAndDep.getTeaJob());
        flag=departmentMapper.insert(department);
        System.out.println("department_flag:"+flag);
        jsonObject.put("msg","教师信息已增加");
        jsonObject.put("success","success");
        jsonObject.put("code",001);
        return jsonObject;
    }
}
