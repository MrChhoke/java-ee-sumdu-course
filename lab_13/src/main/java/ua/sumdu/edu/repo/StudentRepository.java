package ua.sumdu.edu.repo;

import lombok.Getter;
import lombok.Setter;
import ua.sumdu.edu.db.ConnectionPool;
import ua.sumdu.edu.entity.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class StudentRepository {


    public List<Student> getStudents() {
        List<Student> students;
        try (Connection connection = ConnectionPool.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery("SELECT * FROM public.university");

            students = new ArrayList<>(rs.getFetchSize());

            while (rs.next()) {
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String group = rs.getString("group");
                String email = rs.getString("email");
                String faculty = rs.getString("faculty");
                int age = rs.getInt("age");

                students.add(new Student(name,
                        surname,
                        email,
                        group,
                        faculty,
                        age
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return students;
    }

    public void insertStudent(Student student) {
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = ConnectionPool.getConnection();
            ps = connection.prepareStatement("INSERT INTO university VALUES (?,?,?,?,?,?)");

            int k = 0;
            ps.setString(++k, student.getName());
            ps.setString(++k, student.getSurname());
            ps.setString(++k, student.getEmail());
            ps.setString(++k, student.getGroup());
            ps.setString(++k, student.getFaculty());
            ps.setInt(++k, student.getAge());

            ps.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }

}
