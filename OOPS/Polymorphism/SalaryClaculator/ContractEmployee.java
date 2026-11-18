package OOPS.Polymorphism.SalaryClaculator;

import java.util.Scanner;

public class ContractEmployee extends Employee{
    
    @Override 
    public void calculateSalary(){

        super.calculateSalary();

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the contract amount except contractor share : ");
        int contractAmount = sc.nextInt();

        System.out.print("Enter the number of employee : ");
        int numberOfEmployee = sc.nextInt();

        if(contractAmount > 0){
            if(numberOfEmployee > 0){
                int totalAmountOfEachEmployee = contractAmount / numberOfEmployee;
                System.out.println("Contract amount of each employee : " + totalAmountOfEachEmployee);
            }else{
                System.out.println("Number of employee must be greater than 0");
            }
        }else{
            System.out.println("Invalid Cridentials!");
        }

    }

}
