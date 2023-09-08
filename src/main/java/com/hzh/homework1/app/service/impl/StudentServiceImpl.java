package com.hzh.homework1.app.service.impl;

import com.hzh.homework1.app.service.StudentService;
import com.hzh.homework1.domain.entity.Student;
import com.hzh.homework1.domain.repository.StudentRepository;
import com.hzh.homework1.domain.vo.StudentCourseGradeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student getStudentById(int id) {
        return studentRepository.getStudentById(id);
    }

    @Override
    public boolean insertStudent(Student student) {
        return studentRepository.insertStudent(student);
    }

    @Override
    public boolean updateStudent(Student student) {
        return studentRepository.updateStudent(student);
    }

    @Override
    public List<Student> searchStudents(String gender, String lastName) {
        return studentRepository.searchStudents(gender,lastName);
    }

    @Override
    public boolean deleteStudentById(int id) {
        return studentRepository.deleteStudentById(id);
    }

    @Override
    public boolean deleteStudents(List<Integer> ids) {
        return studentRepository.deleteStudents(ids);
    }

    @Override
    public StudentCourseGradeVO getStudentCourseGradeVOByStudentId(Integer studentId) {
        return studentRepository.getStudentCourseGradeVOByStudentId(studentId);
    }
}
