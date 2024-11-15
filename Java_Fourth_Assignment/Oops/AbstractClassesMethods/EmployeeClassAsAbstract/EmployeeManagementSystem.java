package Oops.AbstractClassesMethods.EmployeeClassAsAbstract;

import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create HourlyEmployee
        System.out.println("Enter details for hourly employee:");
        System.out.print("Name: ");
        String name1 = scanner.nextLine();
        System.out.print("ID: ");
        int id1 = scanner.nextInt();
        System.out.print("Hourly Rate: ");
        double rate = scanner.nextDouble();
        System.out.print("Hours Worked: ");
        int hours = scanner.nextInt();

        Employee hourlyEmployee = new HourlyEmployee(name1, id1, rate, hours);
        hourlyEmployee.getEmployeeDetails();
        System.out.println("Calculated Pay: $" + hourlyEmployee.calculatePay());

        System.out.println("\nEnter details for salaried employee:");
        scanner.nextLine();
        System.out.print("Name: ");
        String name2 = scanner.nextLine();
        System.out.print("ID: ");
        int id2 = scanner.nextInt();
        System.out.print("Annual Salary: ");
        double salary = scanner.nextDouble();

        Employee salariedEmployee = new SalariedEmployee(name2, id2, salary);
        salariedEmployee.getEmployeeDetails();
        System.out.println("Calculated Pay: $" + salariedEmployee.calculatePay());

        scanner.close();
    }
}
