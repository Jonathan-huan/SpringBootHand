package com.hzh.homework1.infra.repository.impl;

import com.hzh.homework1.domain.entity.Course;
import com.hzh.homework1.domain.repository.CourseRepository;
import com.hzh.homework1.infra.mapper.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CourseRepositoryImpl implements CourseRepository {
    @Autowired
    private CourseMapper courseMapper;

    @Override
    public Course getCourseById(int id) {
        return courseMapper.getCourseById(id);
    }

    @Override
    public boolean insertCourse(Course course) {
        return courseMapper.insertCourse(course)==1;
    }

    @Override
    public boolean updateCourse(Course course) {
        return courseMapper.updateCourse(course)==1;
    }

    @Override
    public boolean deleteCourseById(int id) {
        return courseMapper.deleteCourseById(id)==1;
    }
}
