package Oops.ExceptionHandling.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        try {
            calculator.calculate(2, 0, "/");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
