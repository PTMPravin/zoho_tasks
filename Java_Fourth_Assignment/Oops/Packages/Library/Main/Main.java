package Oops.Packages.Library.Main;
import Oops.Packages.Library.Books.Book;
import Oops.Packages.Library.Member.Member;
import Oops.Packages.Library.Transaction.Transaction;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("1984", "George Orwell", "9780451524935");
        Member member1 = new Member("M001", "Alice");

        Transaction transaction = new Transaction(member1, book1);
        System.out.println(member1.getName() + " borrowed the book " + book1.getTitle() + " on " + transaction.getIssueDate());

        transaction.returnBook();
        System.out.println(member1.getName() + " returned the book on " + transaction.getReturnDate());
    }
}
