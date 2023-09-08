package com.hzh.homework1.domain.vo;

import com.hzh.homework1.domain.entity.Course;
import com.hzh.homework1.domain.entity.Grade;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class CourseGradeVO {
    private Course course;
    private BigDecimal score;
}
