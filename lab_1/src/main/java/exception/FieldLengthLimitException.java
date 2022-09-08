package exception;

public class FieldLengthLimitException extends Exception{

    public FieldLengthLimitException() {
        super("The field length is excessive");
    }

    public FieldLengthLimitException(String message) {
        super(message);
    }
}
