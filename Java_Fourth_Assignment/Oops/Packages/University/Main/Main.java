package Oops.Packages.University.Main;

import Oops.Packages.University.Student.Student;
import Oops.Packages.University.Course.Course;
import Oops.Packages.University.Faculty.Faculty;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("CS101", "Intro to Computer Science", 3);
        Faculty faculty = new Faculty("F001", "Dr. Alan Turing", "Computer Science");
        Student student = new Student("S001", "Alice Johnson", course.getCourseCode());

        System.out.println("Course: " + course.getCourseName() + " (" + course.getCredits() + " credits)");
        System.out.println("Faculty: " + faculty.getName() + ", Department: " + faculty.getDepartment());
        System.out.println("Student: " + student.getName() + " enrolled in course " + student.getEnrolledCourse());
    }
}
