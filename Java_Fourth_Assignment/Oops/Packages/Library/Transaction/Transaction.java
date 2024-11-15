package Oops.Packages.Library.Transaction;

import Oops.Packages.Library.Books.Book;
import Oops.Packages.Library.Member.Member;

import java.util.Date;

public class Transaction {
    private Member member;
    private Book book;
    private Date issueDate;
    private Date returnDate;

    public Transaction(Member member, Book book) {
        this.member = member;
        this.book = book;
        this.issueDate = new Date();
        this.returnDate = null;
        book.setAvailable(false);
    }

    public void returnBook() {
        this.returnDate = new Date();
        this.book.setAvailable(true);
    }

    public Member getMember() {
        return member;
    }

    public Book getBook() {
        return book;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }
}
