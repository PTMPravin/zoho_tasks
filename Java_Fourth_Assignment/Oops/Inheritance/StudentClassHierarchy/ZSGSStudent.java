package Oops.Inheritance.StudentClassHierarchy;

public class ZSGSStudent extends Student {
    String course;
     ZSGSStudent(String name, int age, String course) {
        super(name, age);
        this.course = course;
        System.out.println("ZSGSStudent constructor called!");
     }
}
