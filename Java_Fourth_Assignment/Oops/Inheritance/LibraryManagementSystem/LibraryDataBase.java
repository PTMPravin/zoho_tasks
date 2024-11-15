package Oops.Inheritance.LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryDataBase {
    List<Book> listOfBooks;

    public LibraryDataBase() {
        this.listOfBooks = new ArrayList<>();
    }

    public void add(Book book) {
        listOfBooks.add(book);
        System.out.println("Added book: " + book.title);
    }

    public void delete(String ISBN) {
        Book bookToDelete = findBookByISBN(ISBN);
        if (bookToDelete != null) {
            listOfBooks.remove(bookToDelete);
            System.out.println("Deleted book: " + bookToDelete);
        } else {
            System.out.println("Book with ISBN " + ISBN + " not found.");
        }
    }

    public void update(String ISBN, String newTitle, String newAuthor, String newPublication) {
        Book bookToUpdate = findBookByISBN(ISBN);

        if (bookToUpdate != null) {
            if (newTitle != null && !newTitle.isEmpty()) {
                bookToUpdate.setTitle(newTitle);
            }
            if (newAuthor != null && !newAuthor.isEmpty()) {
                bookToUpdate.setAuthor(newAuthor);
            }
            if (newPublication != null && !newPublication.isEmpty()) {
                bookToUpdate.setPublication(newPublication);
            }
            System.out.println("Updated book: " + bookToUpdate);
        } else {
            System.out.println("Book with ISBN " + ISBN + " not found.");
        }
    }

    public void display() {
        System.out.println("Displaying books in the library:");
        for (Book book : listOfBooks) {
            System.out.println(book.title);
        }
    }

    public void search(String title) {
        System.out.println("Searching for book with title: " + title);
        for (Book book : listOfBooks) {
            if (book.title.equals(title)) {
                System.out.println("Found book: " + book);
                return;
            }
        }
        System.out.println("Book with title " + title + " not found.");
    }

    private Book findBookByISBN(String ISBN) {
        for (Book book : listOfBooks) {
            if (book.ISBN.equals(ISBN)) {
                return book;
            }
        }
        return null;
    }
}
