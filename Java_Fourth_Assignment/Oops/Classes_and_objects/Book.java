package Oops.Classes_and_objects;

public class Book {

    // Instance Variables
    private String title;
    private String author;
    private String isbn;
    private double price;
    private int pages;

    // Static Variable
    private static String publisher = "Default Publisher";

    public Book(String title, String author, String isbn, double price, int pages) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public static String getPublisher() {
        return publisher;
    }

    public static void setPublisher(String publisher) {
        Book.publisher = publisher;
    }
}