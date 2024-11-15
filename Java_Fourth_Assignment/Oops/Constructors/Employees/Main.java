package Oops.Constructors.Employees;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        
        company.addEmployee("ptm", 1, "Developer", "ptm@gamil.com", "1237564890" );
        
        company.displayEmployees();
    }
}
