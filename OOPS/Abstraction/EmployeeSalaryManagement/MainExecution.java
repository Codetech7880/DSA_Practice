package OOPS.Abstraction.EmployeeSalaryManagement;

public class MainExecution {
    public static void main(String[] args) {
        
        FullTimeEmployee obj1 = new FullTimeEmployee(101, "Sachin");
        PartTimeEmployee obj2 = new PartTimeEmployee(102, "Mukul");
        ContractEmployee obj3 = new ContractEmployee(103, "Subbarao");

        obj1.dispalyDetails();
        obj1.calculateSalary();
        
        obj2.dispalyDetails();
        obj2.calculateSalary();
        
        obj3.dispalyDetails();
        obj3.calculateSalary();

    }
}
