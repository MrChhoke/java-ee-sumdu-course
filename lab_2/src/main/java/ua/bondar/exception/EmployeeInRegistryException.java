package ua.bondar.exception;

public class EmployeeInRegistryException extends Exception{

    public EmployeeInRegistryException() {
        super();
    }

    public EmployeeInRegistryException(String message) {
        super(message);
    }
}
