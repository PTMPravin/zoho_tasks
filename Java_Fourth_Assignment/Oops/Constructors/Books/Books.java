package Oops.Constructors.Books;

public class Books {

    private static int bookCount = 0;

    // Instance variables
    private String title;
    private String author;
    private String ISBN;
    private int publicationYear;

    // Constructor
    public Books(String title, String author, String ISBN, int publicationYear) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publicationYear = publicationYear;
        bookCount++;
    }

    // Getters
    public String getTitle() {
        return title; 
    }
    public String getAuthor() { 
        return author; 
    }
    public String getISBN() { 
        return ISBN; 
    }
    public int getPublicationYear() { 
        return publicationYear; 
    }

    public static int getBookCount() {
        return bookCount; 
    }
    
    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Publication Year: " + publicationYear);
    }
}
