package OOPS.Polymorphism.SalaryClaculator;

import java.util.Scanner;

public class PartTimeEmployee extends Employee{
    
    @Override 
    public void calculateSalary(){

        super.calculateSalary();

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter total number of hours : ");
        int empHours = sc.nextInt();

        if(empHours > 0){
            int totalSalary = empHours * 2000;
            System.out.println("Employee hourly salary : " + totalSalary);
        }else{
            System.out.println("Invalid Cridentials!");
        }

    }

}
