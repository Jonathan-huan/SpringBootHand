package com.hzh.homework1.api.controller;

import com.hzh.homework1.app.service.StudentService;
import com.hzh.homework1.domain.entity.Student;
import com.hzh.homework1.domain.vo.StudentCourseGradeVO;
import com.hzh.homework1.infra.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @PostMapping
    public boolean insertStudent(Student student) {
        return studentService.insertStudent(student);
    }

    @PutMapping
    public boolean updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/{id}")
    public boolean deleteStudentById(@PathVariable int id) {
        return studentService.deleteStudentById(id);
    }

    @GetMapping
    public List<Student> searchStudents(String gender, String lastName){
        return studentService.searchStudents(gender,lastName);
    }

    @DeleteMapping("/batch")
    public boolean deleteStudents(@RequestBody List<Integer> ids){
        return studentService.deleteStudents(ids);
    }

    @GetMapping("/course-grade/{studentId}")
    public StudentCourseGradeVO getStudentCourseGradeVoByStudentId(@PathVariable Integer studentId){
        return studentService.getStudentCourseGradeVOByStudentId(studentId);
    }

    @GetMapping("/info")
    public ModelAndView studentInfo(String gender, String lastName){
        List<Student> studentList = studentService.searchStudents(gender, lastName);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("studentList", studentList);
        modelAndView.addObject("gender",gender);
        modelAndView.addObject("lastName",lastName);
        modelAndView.setViewName("student");
        return modelAndView;
    }
}
