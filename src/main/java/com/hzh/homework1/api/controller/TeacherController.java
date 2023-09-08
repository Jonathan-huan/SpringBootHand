package com.hzh.homework1.api.controller;

import com.hzh.homework1.app.service.TeacherService;
import com.hzh.homework1.domain.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @GetMapping("/{id}")
    public Teacher getTeacherById(@PathVariable int id) {
        return teacherService.getTeacherById(id);
    }

    @PostMapping
    public boolean insertTeacher(@RequestBody Teacher teacher) {
        return teacherService.insertTeacher(teacher);
    }

    @PutMapping
    public boolean updateTeacher(@RequestBody Teacher teacher) {
        return teacherService.updateTeacher(teacher);
    }

    @DeleteMapping("/{id}")
    public boolean deleteTeacherById(@PathVariable int id) {
        return teacherService.deleteTeacherById(id);
    }
}
