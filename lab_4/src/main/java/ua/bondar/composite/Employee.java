package ua.bondar.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee {

    private static int next_id = 1;

    private int id;
    private int idBoss;
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary, int idBoss) {
        id = next_id;
        next_id++;
        this.idBoss = idBoss;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void add(Employee... employees) {
        subordinates.addAll(Arrays.asList(employees));
    }

    public void remove(Employee employee) {
        subordinates.remove(employee);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Employee)) return false;

        Employee employee = (Employee) obj;

        return this.id == employee.id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", idBoss=" + idBoss +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void printHierarchicalTree() {
        printHierarchicalTree(0);
    }

    private void printHierarchicalTree(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("\t\t\t\t");
        }
        System.out.println(this);
        for (Employee employee : getSubordinates()) {
            employee.printHierarchicalTree(level + 1);
        }
    }
}
