package Oops.AbstractClassesMethods.EmployeeClassAsAbstract;

abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculatePay();

    public void getEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
}
