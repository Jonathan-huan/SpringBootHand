package com.hzh.homework1.app.service;

import com.hzh.homework1.domain.entity.Student;
import com.hzh.homework1.domain.vo.StudentCourseGradeVO;

import java.util.List;

public interface StudentService {
    Student getStudentById(int id);
    boolean insertStudent(Student student);
    boolean updateStudent(Student student);
    List<Student> searchStudents(String gender, String lastName);
    boolean deleteStudentById(int id);
    boolean deleteStudents(List<Integer> ids);
    StudentCourseGradeVO getStudentCourseGradeVOByStudentId(Integer studentId);
}
