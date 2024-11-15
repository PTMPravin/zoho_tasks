package Oops.Inheritance.LibraryManagementSystem;

public class Student extends User {
    String studentClass;

    Student(String studentClass, String name, int id) {
        super(name, id);
        this.studentClass = studentClass;
    }
}
