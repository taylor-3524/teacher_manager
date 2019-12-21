package com.service;

import com.dto.TeaAndDep;
import com.entity.Teacher;
import net.sf.json.JSONObject;

public interface ImplTeacherAddService {
    public JSONObject checkTeaNum( Integer number);
    public JSONObject addAction(TeaAndDep teaAndDep);
}
