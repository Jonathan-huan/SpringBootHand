package com.hzh.homework1.app.service.impl;

import com.hzh.homework1.app.service.TeacherService;
import com.hzh.homework1.domain.entity.Teacher;
import com.hzh.homework1.domain.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;
    @Override
    public Teacher getTeacherById(int id) {
        return teacherRepository.getTeacherById(id);
    }

    @Override
    public boolean insertTeacher(Teacher teacher) {
        return teacherRepository.insertTeacher(teacher);
    }

    @Override
    public boolean updateTeacher(Teacher teacher) {
        return teacherRepository.updateTeacher(teacher);
    }

    @Override
    public boolean deleteTeacherById(int id) {
        return teacherRepository.deleteTeacherById(id);
    }
}
