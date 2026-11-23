package OOPS.Abstraction.EmployeeSalaryManagement;

import java.util.Scanner;

public class PartTimeEmployee extends Employee{
    
    PartTimeEmployee(int EmployeeId, String EmploeeName) {
        super(EmployeeId, EmploeeName);
    }

    @Override 
    public void calculateSalary(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of hours : ");
        int numberOfHours = sc.nextInt();

        System.out.print("Enter the salary as per hour : ");
        int salaryPerHours = sc.nextInt();

        int totalSalary = numberOfHours * salaryPerHours;
        System.out.println("Total salary of " + EmploeeName + " : " + totalSalary);
    }

    @Override 
    public void dispalyDetails(){
        System.out.println("Employee name is : " + EmploeeName );
        System.out.println("Employee id is : " + EmployeeId );
    }

}
