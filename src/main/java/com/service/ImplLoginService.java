package com.service;

import com.entity.Teacher;

import javax.servlet.http.HttpSession;

public interface ImplLoginService {
    public void checkuser(Teacher teacher,HttpSession session);
}
