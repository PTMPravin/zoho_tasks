package Oops.Inheritance.LibraryManagementSystem;

public class User {
    String name;
    int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void verify() {
        System.out.println("Verifying user: " + name);
    }

    public void checkAccount() {
        System.out.println("Checking account for user: " + name);
    }

    public void getBookInfo() {
        System.out.println("Fetching book info for user: " + name);
    }
}
