package Oops.MethodOverRiding.Employee;

class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getEmployeeDetails() {
        return "Employee ID: " + id + ", Name: " + name;
    }
}

class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public String getEmployeeDetails() {
        return super.getEmployeeDetails() + ", Hourly Rate: " + hourlyRate + ", Hours Worked: " + hoursWorked;
    }
}

class SalariedEmployee extends Employee {
    private double annualSalary;

    public SalariedEmployee(String name, int id, double annualSalary) {
        super(name, id);
        this.annualSalary = annualSalary;
    }

    public String getEmployeeDetails() {
        return super.getEmployeeDetails() + ", Annual Salary: " + annualSalary;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        
        Employee e1 = new HourlyEmployee("ptm", 101, 15.50, 40);
        Employee e2 = new SalariedEmployee("ptm", 102, 50000);

        System.out.println(e1.getEmployeeDetails());
        System.out.println(e2.getEmployeeDetails());
    }
}

