package Oops.ExceptionHandling.Calculator;

public class IllegalOperationException extends Exception {
    public IllegalOperationException(String message) {
        super(message);
    }
}
