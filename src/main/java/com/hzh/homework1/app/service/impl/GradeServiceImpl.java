package com.hzh.homework1.app.service.impl;

import com.hzh.homework1.app.service.GradeService;
import com.hzh.homework1.domain.entity.Grade;
import com.hzh.homework1.domain.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GradeServiceImpl implements GradeService {
    @Autowired
    private GradeRepository gradeRepository;

    @Override
    public Grade getGradeById(int id) {
        return gradeRepository.getGradeById(id);
    }

    @Override
    public boolean insertGrade(Grade grade) {
        return gradeRepository.insertGrade(grade);
    }

    @Override
    public boolean updateGrade(Grade grade) {
        return gradeRepository.updateGrade(grade);
    }

    @Override
    public boolean deleteGradeById(int id) {
        return gradeRepository.deleteGradeById(id);
    }
}
