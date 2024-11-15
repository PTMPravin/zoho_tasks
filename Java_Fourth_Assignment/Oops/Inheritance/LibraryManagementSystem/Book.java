package Oops.Inheritance.LibraryManagementSystem;

public class Book {
    String title;
    String author;
    String ISBN;
    String publication;

    public Book(String title, String author, String ISBN, String publication) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publication = publication;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public void showDueDate() {
        System.out.println("Showing due date for book: " + title);
    }

    public void reservationStatus() {
        System.out.println("Checking reservation status for book: " + title);
    }

    public void feedback() {
        System.out.println("Providing feedback for book: " + title);
    }

    public void bookRequest() {
        System.out.println("Requesting book: " + title);
    }

    public void renewInfo() {
        System.out.println("Renewing info for book: " + title);
    }
}
