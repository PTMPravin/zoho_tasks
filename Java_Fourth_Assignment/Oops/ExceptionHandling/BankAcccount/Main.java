package Oops.ExceptionHandling.BankAcccount;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(2507);

        try {
            bankAccount.withdraw(257);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
