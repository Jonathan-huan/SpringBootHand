package com.hzh.homework1.domain.vo;

import com.hzh.homework1.domain.entity.Course;
import com.hzh.homework1.domain.entity.Grade;
import lombok.Data;

import java.util.List;

@Data
public class StudentCourseGradeVO {
    private Integer studentID;
    private List<CourseGradeVO> courseGradeVOList;
}
