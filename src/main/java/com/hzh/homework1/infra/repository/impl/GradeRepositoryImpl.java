package com.hzh.homework1.infra.repository.impl;

import com.hzh.homework1.domain.entity.Grade;
import com.hzh.homework1.domain.repository.GradeRepository;
import com.hzh.homework1.infra.mapper.GradeMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GradeRepositoryImpl implements GradeRepository {
    @Autowired
    private GradeMapper gradeMapper;
    @Override
    public Grade getGradeById(int id) {
        return gradeMapper.getGradeById(id);
    }

    @Override
    public boolean insertGrade(Grade grade) {
        return gradeMapper.insertGrade(grade)==1;
    }

    @Override
    public boolean updateGrade(Grade grade) {
        return gradeMapper.updateGrade(grade)==1;
    }

    @Override
    public boolean deleteGradeById(int id) {
        return gradeMapper.deleteGradeById(id)==1;
    }
}
