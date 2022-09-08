import exception.FieldLengthLimitException;
import exception.IncorrectSalaryException;

public class Employee {
    private static int nextID = 1;

    public final static int MAX_LENGTH_NAME = 5;

    private int id;
    private String name;
    private String surname;
    private double salary;

    public Employee(String name, String surname, double salary) throws Exception {
        if(name.length() > MAX_LENGTH_NAME || surname.length() > MAX_LENGTH_NAME){
            throw new FieldLengthLimitException("Employee name or surname is so big");
        }

        if(salary < 0){
            throw new IncorrectSalaryException();
        }

        this.id = nextID++;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
