package com.hzh.homework1.app.service;

import com.hzh.homework1.domain.entity.Teacher;

public interface TeacherService {
    Teacher getTeacherById(int id);
    boolean insertTeacher(Teacher teacher);
    boolean updateTeacher(Teacher teacher);
    boolean deleteTeacherById(int id);
}
