package com.hzh.homework1.app.service;

import com.hzh.homework1.domain.entity.Course;

public interface CourseService {
    Course getCourseById(int id);
    boolean insertCourse(Course course);
    boolean updateCourse(Course course);
    boolean deleteCourseById(int id);
}
