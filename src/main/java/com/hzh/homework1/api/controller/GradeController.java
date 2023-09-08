package com.hzh.homework1.api.controller;

import com.hzh.homework1.app.service.GradeService;
import com.hzh.homework1.domain.entity.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/grade")
public class GradeController {
    @Autowired
    private GradeService gradeService;

    @GetMapping("/{id}")
    public Grade getGradeById(@PathVariable int id) {
        return gradeService.getGradeById(id);
    }

    @PostMapping
    public boolean insertGrade(@RequestBody Grade grade) {
        return gradeService.insertGrade(grade);
    }

    @PutMapping
    public boolean updateGrade(@RequestBody Grade grade) {
        return gradeService.updateGrade(grade);
    }

    @DeleteMapping("/{id}")
    public boolean deleteGradeById(@PathVariable int id) {
        return gradeService.deleteGradeById(id);
    }
}
