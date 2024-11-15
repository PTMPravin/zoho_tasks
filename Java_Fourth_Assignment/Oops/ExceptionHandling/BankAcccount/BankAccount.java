package Oops.ExceptionHandling.BankAcccount;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance+=amount;
    }

    public void withdraw(double withdrawAmount) throws InsufficientBalanceException {
        if (withdrawAmount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }

        double balanceAmount = balance - withdrawAmount;

        System.out.println("Withdrawn Successfully");
        System.out.println("Withdrawn Amount : "+withdrawAmount);
        System.out.println("Balnce Amount : "+balanceAmount);
    }
}
