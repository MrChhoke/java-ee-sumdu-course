CREATE DATABASE university;
CREATE TABLE Student
(
    "name"  VARCHAR(200) NOT NULL,
    surname VARCHAR(200) NOT NULL,
    email   VARCHAR(200) NOT NULL UNIQUE,
    "group" VARCHAR(200) NOT NULL,
    faculty VARCHAR(200) NOT NULL,
    age     INT          NOT NULL CHECK ( age >= 0 )
);