package com.hzh.homework1.infra.mapper;

import com.hzh.homework1.domain.entity.Student;
import com.hzh.homework1.domain.vo.CourseGradeVO;
import com.hzh.homework1.domain.vo.StudentCourseGradeVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    Student getStudentById(Integer id);
    int updateStudent(Student student);
    int insertStudent(Student student);
    int deleteStudentById(Integer id);
    List<Student> searchStudents(String gender, String lastName);
    int deleteStudents(List<Integer> ids);
    StudentCourseGradeVO getStudentCourseGradeVOByStudentId(Integer studentId);
}
