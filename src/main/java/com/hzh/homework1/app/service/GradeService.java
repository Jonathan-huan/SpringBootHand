package com.hzh.homework1.app.service;

import com.hzh.homework1.domain.entity.Grade;

public interface GradeService {
    Grade getGradeById(int id);
    boolean insertGrade(Grade grade);
    boolean updateGrade(Grade grade);
    boolean deleteGradeById(int id);
}
