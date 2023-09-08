package com.hzh.homework1.domain.repository;

import com.hzh.homework1.domain.entity.Teacher;

public interface TeacherRepository {
    Teacher getTeacherById(int id);
    boolean insertTeacher(Teacher teacher);
    boolean updateTeacher(Teacher teacher);
    boolean deleteTeacherById(int id);
}
