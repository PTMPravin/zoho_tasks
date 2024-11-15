package Oops.Packages.University.Student;

public class Student {
    private String studentId;
    private String name;
    private String enrolledCourse;

    public Student(String studentId, String name, String enrolledCourse) {
        this.studentId = studentId;
        this.name = name;
        this.enrolledCourse = enrolledCourse;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getEnrolledCourse() {
        return enrolledCourse;
    }
}
