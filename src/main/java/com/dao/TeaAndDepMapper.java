package com.dao;

import com.dto.TeaAndDep;

import java.util.List;

public interface TeaAndDepMapper {
    public List<TeaAndDep> selectByDepAndJob(TeaAndDep teaAndDep);
}
