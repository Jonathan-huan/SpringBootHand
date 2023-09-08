package com.hzh.homework1.domain.entity;

import lombok.Data;

@Data
public class Teacher {
    /*
    CREATE TABLE Teachers (
    TeacherID INT PRIMARY KEY AUTO_INCREMENT,
    FirstName VARCHAR(255),
    LastName VARCHAR(255),
    DateOfBirth DATE,
    Gender ENUM('Male', 'Female', 'Other'),
    Email VARCHAR(255) UNIQUE,
    PhoneNumber VARCHAR(20),
    Department VARCHAR(255)
);
    */
    private Integer teacherID;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private String email;
    private String phoneNumber;
    private String department;
}
