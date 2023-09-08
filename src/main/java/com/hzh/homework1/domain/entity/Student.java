package com.hzh.homework1.domain.entity;

import lombok.Data;

@Data
public class Student {
    /*
     CREATE TABLE Students (
    StudentID INT PRIMARY KEY AUTO_INCREMENT,
    FirstName VARCHAR(255),
    LastName VARCHAR(255),
    DateOfBirth DATE,
    Gender ENUM('Male', 'Female', 'Other'),
    Email VARCHAR(255) UNIQUE,
    PhoneNumber VARCHAR(20),
    Address VARCHAR(255)
);
     */
    private Integer studentID;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private String email;
    private String phoneNumber;
    private String address;
}
