package OOPS.Abstraction.EmployeeSalaryManagement;

import java.util.Scanner;

public class ContractEmployee extends Employee{
    
    ContractEmployee(int EmployeeId, String EmploeeName) {
        super(EmployeeId, EmploeeName);
    }

    @Override 
    public void calculateSalary(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of months : ");
        int numberOfMonths = sc.nextInt();

        System.out.print("Enter the decided amount of the contract : ");
        int decidedContractAmount = sc.nextInt();

        int totalSalary = numberOfMonths * decidedContractAmount;
        System.out.println("Total salary of " + EmploeeName + " : " + totalSalary);
    }

    @Override 
    public void dispalyDetails(){
        System.out.println("Employee name is : " + EmploeeName );
        System.out.println("Employee id is : " + EmployeeId );
    }

}
