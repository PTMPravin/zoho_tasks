package Oops.Constructors.Employees;

import java.util.ArrayList;

public class Company {
    private ArrayList<Employee> emp = new ArrayList<>();

    public void addEmployee(String name, int id, String department, String eMail, String phoneNumber) {
        Employee employee = new Employee(name, id, department, eMail, phoneNumber);
        emp.add(employee);
    }

    public void displayEmployees() {
        System.out.println("Books in the Library:");
        for (Employee mp : emp) {
            mp.display();
        }
    }
}
