package com.hzh.homework1.infra.mapper;

import com.hzh.homework1.domain.entity.Course;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CourseMapper {
    Course getCourseById(Integer id);
    int updateCourse(Course course);
    int insertCourse(Course course);
    int deleteCourseById(Integer id);

}
