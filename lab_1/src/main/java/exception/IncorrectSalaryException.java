package exception;

public class IncorrectSalaryException extends Exception{

    public IncorrectSalaryException() {
        super("The salary can`t be negative");
    }

    public IncorrectSalaryException(String message) {
        super(message);
    }
}
