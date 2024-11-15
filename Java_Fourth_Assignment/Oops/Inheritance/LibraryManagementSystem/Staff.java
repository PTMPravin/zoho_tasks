package Oops.Inheritance.LibraryManagementSystem;

public class Staff extends User {
    String dept;

    Staff(String dept, String name, int id) {
        super(name, id);
        this.dept = dept;
    }
}
