package com.hzh.homework1.infra.mapper;

import com.hzh.homework1.domain.entity.Grade;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GradeMapper {
    Grade getGradeById(Integer id);
    int updateGrade(Grade grade);
    int insertGrade(Grade grade);
    int deleteGradeById(Integer id);
}
