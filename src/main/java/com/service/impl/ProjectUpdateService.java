package com.service.impl;

import com.dao.ProAndTeaMapper;
import com.dao.ProjectMapper;
import com.dto.ProAndTea;
import com.entity.Project;
import com.entity.ProjectExample;
import com.service.ImplProjectUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectUpdateService implements ImplProjectUpdateService {
    @Autowired
    private ProjectMapper projectMapper;


    @Override
    public void updateProjectInfo(Project project) {
        String proName=project.getProName();
        ProjectExample projectExample=new ProjectExample();
        projectExample.createCriteria().andProNameEqualTo(proName);
        projectMapper.updateByExampleSelective(project,projectExample);
    }

    @Autowired
    private ProAndTeaMapper proAndTeaMapper;
    @Override
    public List<ProAndTea> getProAndTeaInfo() {
        List<ProAndTea> list=proAndTeaMapper.selectAllInfo();
        return list;
    }
}
