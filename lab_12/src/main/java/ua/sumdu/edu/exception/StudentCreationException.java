package ua.sumdu.edu.exception;

public class StudentCreationException extends IllegalArgumentException {

    public StudentCreationException() {
        super();
    }

    public StudentCreationException(String s) {
        super(s);
    }

    public StudentCreationException(String message, Throwable cause) {
        super(message, cause);
    }
}
