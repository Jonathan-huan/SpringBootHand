package com.hzh.homework1.infra.repository.impl;

import com.hzh.homework1.domain.entity.Teacher;
import com.hzh.homework1.domain.repository.TeacherRepository;
import com.hzh.homework1.infra.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherRepositoryImpl implements TeacherRepository {
    @Autowired
    private TeacherMapper teacherMapper;
    @Override
    public Teacher getTeacherById(int id) {
        return teacherMapper.getTeacherById(id);
    }

    @Override
    public boolean insertTeacher(Teacher teacher) {
        return teacherMapper.insertTeacher(teacher)==1;
    }

    @Override
    public boolean updateTeacher(Teacher teacher) {
        return teacherMapper.updateTeacher(teacher)==1;
    }

    @Override
    public boolean deleteTeacherById(int id) {
        return teacherMapper.deleteTeacherById(id)==1;
    }
}
