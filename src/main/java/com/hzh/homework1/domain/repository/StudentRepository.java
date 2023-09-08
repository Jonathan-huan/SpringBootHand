package com.hzh.homework1.domain.repository;

import com.hzh.homework1.domain.entity.Student;
import com.hzh.homework1.domain.vo.StudentCourseGradeVO;
import io.swagger.models.auth.In;

import java.util.List;

public interface StudentRepository {
    Student getStudentById(int id);
    boolean insertStudent(Student student);
    boolean updateStudent(Student student);
    boolean deleteStudentById(int id);
    List<Student> searchStudents(String gender, String lastName);
    boolean deleteStudents(List<Integer> ids);
    StudentCourseGradeVO getStudentCourseGradeVOByStudentId(Integer studentId);
}
