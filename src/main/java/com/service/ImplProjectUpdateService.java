package com.service;

import com.dto.ProAndTea;
import com.entity.Project;

import java.util.List;

public interface ImplProjectUpdateService {
    public void updateProjectInfo(Project project);
    public List<ProAndTea> getProAndTeaInfo();
}
