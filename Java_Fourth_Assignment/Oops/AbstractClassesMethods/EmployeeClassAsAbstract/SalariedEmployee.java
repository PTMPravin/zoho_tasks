package Oops.AbstractClassesMethods.EmployeeClassAsAbstract;

class SalariedEmployee extends Employee{
    private double annualSalary;

    public SalariedEmployee(String name, int id, double annualSalary) {
        super(name, id);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculatePay() {
        return annualSalary / 12;  // Monthly salary
    }
}
