package Oops.MethodOverLoading.MathOperation;

public class MathOperations {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        MathOperations operations = new MathOperations();

        System.out.println("Addition: " + operations.add(10, 20));
        System.out.println("Subtraction: " + operations.subtract(20, 5));
        System.out.println("Multiplication: " + operations.multiply(5, 4));
        System.out.println("Division: " + operations.divide(20, 4));

        System.out.println("Addition: " + operations.add(10.5, 20.5));
        System.out.println("Subtraction: " + operations.subtract(20.5, 5.5));
        System.out.println("Multiplication: " + operations.multiply(5.5, 4.5));
        System.out.println("Division: " + operations.divide(20.5, 4.5));
    }
}

