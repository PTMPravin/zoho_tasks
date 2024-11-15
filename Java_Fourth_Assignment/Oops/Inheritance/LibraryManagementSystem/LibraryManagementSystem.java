package Oops.Inheritance.LibraryManagementSystem;

public class LibraryManagementSystem {
    String userType;
    String username;
    String password;

    public LibraryManagementSystem(String userType, String username, String password) {
        this.userType = userType;
        this.username = username;
        this.password = password;
    }

    public void login() {
        System.out.println("Logging in as " + userType + ": " + username);
    }

    public void register() {
        System.out.println("Registering user: " + username);
    }

    public void logout() {
        System.out.println("Logging out user: " + username);
    }
}
