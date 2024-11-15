package Oops.ExceptionHandling.CustomException;

public class Main {
    public static void main(String[] args) {
        try {
            checkCondition(false);
        } catch (CustomException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }
    }

    public static void checkCondition(boolean condition) throws CustomException {
        if (!condition) {
            throw new CustomException("Custom Excption Thrown!");
        }
    }
}
