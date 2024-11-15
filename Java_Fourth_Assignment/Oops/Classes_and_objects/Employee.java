package Oops.Classes_and_objects;

public class Employee {

    // Instance Variables
    private String name;
    private int id;
    private String department;

    private String address;

    // Static Variable
    private static String companyName = "Default Company";

    public Employee(String name, int id, String department, String ssn, String address) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        Employee.companyName = companyName;
    }
}
