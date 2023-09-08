package com.hzh.homework1.domain.entity;

import lombok.Data;

@Data
public class Grade {
    /*
    CREATE TABLE Grades (
    GradeID INT PRIMARY KEY AUTO_INCREMENT,
    StudentID INT,
    CourseID INT,
    Score DECIMAL(5, 2)
);
     */
    private Integer gradeID;
    private Integer studentID;
    private Integer courseID;
    private Double score;
}
