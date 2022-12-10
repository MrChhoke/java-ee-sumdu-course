package ua.sumdu.edu.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ua.sumdu.edu.entity.Student;
import ua.sumdu.edu.repo.StudentRepository;

import java.util.List;
import java.util.Optional;

@Setter
@Getter
@AllArgsConstructor
public class StudentService {

    private StudentRepository rep;

    public StudentService(){
        rep = new StudentRepository();
    }

    public List<Student> findAll() {
        return rep.getStudents();
    }

    public void insertStudent(Student student) {
        rep.insertStudent(student);
    }
}
