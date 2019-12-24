package com.service;

import com.dto.TeaAndDep;
import com.dto.TeaAndDepPlus;
import com.entity.Teacher;

import java.util.List;

public interface ImplTeacherUpdateService {
    public List<TeaAndDepPlus> getPersonInf(Teacher teacher);
    public void updateTeacherInf(Teacher teacher);
}
