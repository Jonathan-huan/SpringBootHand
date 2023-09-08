package com.hzh.homework1.api.controller;

import com.hzh.homework1.app.service.CourseService;
import com.hzh.homework1.domain.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable int id) {
        return courseService.getCourseById(id);
    }

    @PostMapping
    public boolean insertCourse(@RequestBody Course course) {
        return courseService.insertCourse(course);
    }

    @PutMapping
    public boolean updateCourse(@RequestBody Course course) {
        return courseService.updateCourse(course);
    }

    @DeleteMapping("/{id}")
    public boolean deleteCourseById(@PathVariable int id) {
        return courseService.deleteCourseById(id);
    }
}
