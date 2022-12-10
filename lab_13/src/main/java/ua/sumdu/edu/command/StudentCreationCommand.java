package ua.sumdu.edu.command;

import lombok.AllArgsConstructor;
import ua.sumdu.edu.entity.Student;
import ua.sumdu.edu.exception.StudentCreationException;
import ua.sumdu.edu.service.StudentService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@AllArgsConstructor
public class StudentCreationCommand implements Command {

    private final StudentService studentService;

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) {
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String strAge = req.getParameter("age");
        String email = req.getParameter("email");
        String group = req.getParameter("group");
        String faculty = req.getParameter("faculty");

        if (strAge == null) {
            throw new StudentCreationException("The fields cannot be empty");
        }

        int age;
        try {
            age = Integer.parseInt(strAge);
        } catch (Exception exception) {
            throw new StudentCreationException("Age should be a number");
        }

        studentService.insertStudent(
                new Student(
                        name,
                        surname,
                        email,
                        group,
                        faculty,
                        age)
        );

    }

}
