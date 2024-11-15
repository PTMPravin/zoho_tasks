package Oops.Constructors.Books;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        
        library.addBook("The Great Gatsby", "F. Scott Fitzgerald", "1234567890", 1925);
        library.addBook("To Kill a Mockingbird", "Harper Lee", "0987654321", 1960);
        
        library.displayBooks();
    }
}
