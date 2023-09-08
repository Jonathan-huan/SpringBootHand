package com.hzh.homework1.domain.repository;

import com.hzh.homework1.domain.entity.Grade;

public interface GradeRepository {
    Grade getGradeById(int id);
    boolean insertGrade(Grade grade);
    boolean updateGrade(Grade grade);
    boolean deleteGradeById(int id);
}
