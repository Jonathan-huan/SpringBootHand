package com.hzh.homework1.infra.repository.impl;

import com.hzh.homework1.domain.entity.Student;
import com.hzh.homework1.domain.repository.StudentRepository;
import com.hzh.homework1.domain.vo.StudentCourseGradeVO;
import com.hzh.homework1.infra.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student getStudentById(int id) {
        return studentMapper.getStudentById(id);
    }

    @Override
    public boolean insertStudent(Student student) {
        return studentMapper.insertStudent(student)==1;
    }

    @Override
    public boolean updateStudent(Student student) {
        return studentMapper.updateStudent(student)==1;
    }

    @Override
    public boolean deleteStudentById(int id) {
        return studentMapper.deleteStudentById(id)==1;
    }

    @Override
    public List<Student> searchStudents(String gender, String lastName) {
        return studentMapper.searchStudents(gender,lastName);
    }

    @Override
    public boolean deleteStudents(List<Integer> ids) {
        return studentMapper.deleteStudents(ids)==ids.size();
    }

    @Override
    public StudentCourseGradeVO getStudentCourseGradeVOByStudentId(Integer studentId) {
        return studentMapper.getStudentCourseGradeVOByStudentId(studentId);
    }


}
