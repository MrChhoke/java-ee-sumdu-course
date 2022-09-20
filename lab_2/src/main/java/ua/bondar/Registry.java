package ua.bondar;

import ua.bondar.entity.Employee;
import ua.bondar.exception.EmployeeInRegistryException;

import java.util.ArrayList;
import java.util.List;

public class Registry {
    private static Registry workersRegistry;
    List<Employee> workers;

    private Registry(){
        workers = new ArrayList<>();
    }

    public static Registry getRegistry(){
        if(workersRegistry == null){
            workersRegistry = new Registry();
        }
        return workersRegistry;
    }

    public void registerNewEmployee(Employee employee) throws EmployeeInRegistryException {
        if(workers.contains(employee)){
            throw new EmployeeInRegistryException("The employee is already exist");
        }
        workers.add(employee);
    }

    public void printList(){
        workers.stream()
                .forEach(System.out::println);
    }
}
