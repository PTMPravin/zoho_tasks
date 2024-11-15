package Oops.Constructors.Employees;

public class Employee {
    // Instance Variables
    private String name;
    private int id;
    private String department;
    private String eMail;
    private String phoneNumber;

    public Employee(String name, int id, String department, String eMail, String phoneNumber) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void display() {
        System.out.println("Name: " + name + ", Employee ID: " + id + ", Email: " + eMail + 
                           ", Phone: " + phoneNumber);
    }
}
