package com.dao;

import com.dto.TeaAndDep;
import com.dto.TeaAndDepPlus;
import com.entity.Teacher;

import java.util.List;

public interface TeaAndDepPlusMapper {
    public List<TeaAndDepPlus> selectByTeaNumber(Teacher teacher);

}
