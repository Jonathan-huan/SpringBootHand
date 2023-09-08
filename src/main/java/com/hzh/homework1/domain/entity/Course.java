package com.hzh.homework1.domain.entity;

import lombok.Data;

@Data
public class Course {
    /*
    CREATE TABLE Courses (
    CourseID INT PRIMARY KEY AUTO_INCREMENT,
    CourseName VARCHAR(255),
    Description TEXT,
    TeacherID INT
);

     */
    private Integer courseID;
    private String courseName;
    private String description;
    private Integer teacherID;
}
