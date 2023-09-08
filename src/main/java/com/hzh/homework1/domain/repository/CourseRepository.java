package com.hzh.homework1.domain.repository;

import com.hzh.homework1.domain.entity.Course;

public interface CourseRepository {
    Course getCourseById(int id);
    boolean insertCourse(Course course);
    boolean updateCourse(Course course);
    boolean deleteCourseById(int id);
}
