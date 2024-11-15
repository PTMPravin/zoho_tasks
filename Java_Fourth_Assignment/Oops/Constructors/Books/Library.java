package Oops.Constructors.Books;

import java.util.ArrayList;

public class Library {
    private ArrayList<Books> book = new ArrayList<>();

    public void addBook(String title, String author, String ISBN, int publicationYear) {
        Books books = new Books(title, author, ISBN, publicationYear);
        book.add(books);
    }

    public void displayBooks() {
        System.out.println("Books in the Library:");
        for (Books books : book) {
            books.display();
        }
    }
}
