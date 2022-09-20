package ua.bondar.entity;

public class Employee {
    private String name;
    private String departmentName;
    private double salary;
    private int id;
    private int managerID;

    public Employee(String name,
                    String departmentName,
                    double salary,
                    int id,
                    int managerID) {
        this.name = name;
        this.departmentName = departmentName;
        this.salary = salary;
        this.id = id;
        this.managerID = managerID;
    }

    public String getName() {
        return name;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public int getManagerID() {
        return managerID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                ", managerID=" + managerID +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
