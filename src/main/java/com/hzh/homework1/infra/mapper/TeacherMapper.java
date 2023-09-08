package com.hzh.homework1.infra.mapper;

import com.hzh.homework1.domain.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherMapper {
    Teacher getTeacherById(Integer id);
    int updateTeacher(Teacher teacher);
    int insertTeacher(Teacher teacher);
    int deleteTeacherById(Integer id);
}
