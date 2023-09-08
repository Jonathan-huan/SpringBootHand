package com.hzh.homework1.app.service.impl;

import com.hzh.homework1.app.service.CourseService;
import com.hzh.homework1.domain.entity.Course;
import com.hzh.homework1.domain.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;
    @Override
    public Course getCourseById(int id) {
        return courseRepository.getCourseById(id);
    }

    @Override
    public boolean insertCourse(Course course) {
        return courseRepository.insertCourse(course);
    }

    @Override
    public boolean updateCourse(Course course) {
        return courseRepository.updateCourse(course);
    }

    @Override
    public boolean deleteCourseById(int id) {
        return courseRepository.deleteCourseById(id);
    }
}
