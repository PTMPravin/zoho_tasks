package Oops.Inheritance.LibraryManagementSystem;

public class Account {
    int noBorrowedBooks;
    int noReservedBooks;
    int noReturnedBooks;
    int noLostBooks;
    double fineAmount;

    public Account(int noBorrowedBooks, int noReservedBooks, int noReturnedBooks, int noLostBooks, double fineAmount) {
        this.noBorrowedBooks = noBorrowedBooks;
        this.noReservedBooks = noReservedBooks;
        this.noReturnedBooks = noReturnedBooks;
        this.noLostBooks = noLostBooks;
        this.fineAmount = fineAmount;
    }

    public void calculateFine() {
        System.out.println("Calculating fine...");
    }
}
