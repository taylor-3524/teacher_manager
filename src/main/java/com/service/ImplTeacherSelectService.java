package com.service;

import com.dto.TeaAndDep;
import com.entity.Teacher;
import net.sf.json.JSONObject;

import java.util.List;

public interface ImplTeacherSelectService {
    public List<Teacher> selectByName(String name);
    public JSONObject selectByDepAndJob(TeaAndDep teaAndDep);
}
