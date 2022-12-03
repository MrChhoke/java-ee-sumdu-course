package ua.sumdu.edu.repo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ua.sumdu.edu.entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter
@Setter
@AllArgsConstructor
public class StudentRepository {

    private List<Student> students;

    public StudentRepository() {
        students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void insertStudent(Student student) {
        students.add(student);
    }

    public Optional<Student> findStudentByName(String name) {
        return students.stream()
                .filter(student -> student.getName().equals(name))
                .findAny();
    }
}
