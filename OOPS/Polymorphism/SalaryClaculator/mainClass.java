package OOPS.Polymorphism.SalaryClaculator;

public class mainClass {
    public static void main(String[] args) {
        
        FullTimeEmployee obj1 = new FullTimeEmployee();
        PartTimeEmployee obj2 = new PartTimeEmployee();
        ContractEmployee obj3 = new ContractEmployee();

        obj1.calculateSalary();
        obj2.calculateSalary();
        obj3.calculateSalary();

    }
}
