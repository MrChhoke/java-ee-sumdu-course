package ua.sumdu.edu.controller;

import ua.sumdu.edu.command.Command;
import ua.sumdu.edu.command.StudentCreationCommand;
import ua.sumdu.edu.entity.Student;
import ua.sumdu.edu.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet({"/", "/index.jsp"})
public class StudentController extends HttpServlet {

    private StudentService studentService;
    private Command studentCreationCommand;

    @Override
    public void init() {
        studentService = new StudentService();
        studentCreationCommand = new StudentCreationCommand(studentService);

        // Дефолтне наповнення
        studentService.insertStudent(new Student(
                "Vladyslav",
                "Bondar",
                "vladbondar16133@gmail.com",
                "IN-01",
                "ELIT",
                19
        ));
    }

    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("students", studentService.findAll());

        req.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req,
                          HttpServletResponse resp) throws IOException {
        studentCreationCommand.execute(req, resp);

        resp.sendRedirect(req.getRequestURL().toString());
    }
}
