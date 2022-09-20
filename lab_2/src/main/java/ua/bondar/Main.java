package ua.bondar;

import ua.bondar.entity.Employee;
import ua.bondar.entity.Manager;

public class Main {
    public static void main(String[] args) {
        Manager employee1 = new Manager("Vlad", "Manager", 5000, 1, 0, 15000);
        Employee employee2 = new Employee("Otto", "Salas", 1000, 2, employee1.getId());
        Employee employee3 = new Employee("Petro", "Sales", 1500, 3, employee1.getId());
        Employee employee4 = new Employee("Santos", "Advertisement", 1050, 4, employee1.getId());

        Registry registry = Registry.getRegistry();

        try {
            registry.registerNewEmployee(employee1);
            registry.registerNewEmployee(employee2);
            registry.registerNewEmployee(employee3);
            registry.registerNewEmployee(employee4);

            registry.printList();

            //Expect error
            registry.registerNewEmployee(employee1);

        }catch (Throwable exp){
            exp.printStackTrace();
        }
    }
}
