package OOPS.Polymorphism.SalaryClaculator;

import java.util.Scanner;

public class FullTimeEmployee extends Employee {
    
    @Override 
    public void calculateSalary(){

        super.calculateSalary();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of months : ");
        int empMonths = sc.nextInt();

        if(empMonths > 0){
            int totalSalary = empMonths * 100000;
            System.out.println("Employee monthly salary : " + totalSalary);
        }else{
            System.out.println("Invalid Cridentials!");
        }

    }

}
