package Oops.Inheritance.LibraryManagementSystem;

public class Librarian {
    String name;
    int id;
    String password;
    String searchString;

    public Librarian(String name, int id, String password, String searchString) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.searchString = searchString;
    }

    public void verifyLibrarian() {
        System.out.println("Verifying librarian: " + name);
    }

    public void search() {
        System.out.println("Searching for: " + searchString);
    }
}
