package com.service.impl;

import com.dao.ProjectMapper;
import com.entity.Project;
import com.service.ImplProjectAddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectAddService implements ImplProjectAddService {
    @Autowired
    private ProjectMapper projectMapper;
    @Override
    public void add(Project project) {
        projectMapper.insertSelective(project);
    }
}
