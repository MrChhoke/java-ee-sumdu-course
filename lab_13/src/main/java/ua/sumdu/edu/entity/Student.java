package ua.sumdu.edu.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import ua.sumdu.edu.exception.StudentCreationException;

@Getter
@NoArgsConstructor
public class Student {

    protected String name;
    protected String surname;
    protected String email;
    protected String group;
    protected String faculty;
    protected int age;

    public Student(String name,
                   String surname,
                   String email,
                   String group,
                   String faculty,
                   int age) {
        setName(name);
        setSurname(surname);
        setEmail(email);
        setGroup(group);
        setFaculty(faculty);
        setAge(age);
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new StudentCreationException("The fields cannot be empty");
        }

        this.name = name;
    }

    public void setSurname(String surname) {
        if (surname == null || surname.isBlank()) {
            throw new StudentCreationException("The fields cannot be empty");
        }

        this.surname = surname;
    }

    public void setEmail(String email) {
        if (email == null || email.isBlank()) {
            throw new StudentCreationException("The fields cannot be empty");
        }

        this.email = email;
    }

    public void setGroup(String group) {
        if (group == null || group.isBlank()) {
            throw new StudentCreationException("The fields cannot be empty");
        }

        this.group = group;
    }

    public void setFaculty(String faculty) {
        if (faculty == null || faculty.isBlank()) {
            throw new StudentCreationException("The fields cannot be empty");
        }

        this.faculty = faculty;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new StudentCreationException("Age of student should be positive");
        }

        this.age = age;
    }
}
