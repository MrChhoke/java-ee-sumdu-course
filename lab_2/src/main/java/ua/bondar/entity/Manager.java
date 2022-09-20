package ua.bondar.entity;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name,
                   String departmentName,
                   double salary,
                   int id,
                   int managerID,
                   double bonus) {
        super(name, departmentName, salary, id, managerID);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

}
