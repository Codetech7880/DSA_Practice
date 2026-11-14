package OOPS.Inheritance;

class Employee{
    public int employeeId;
    public String employeeName;
    public int salary;

    public void displayEmployeeDetails(){
        System.out.println("Display all information about employee.");
    }
}

class Manager extends Employee{
    public String departement;
    public int teamSize;

    public Manager(int employeeId, String employeeName, int salary ,String departement, int teamSize){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.departement = departement;
        this.teamSize = teamSize;
    }

   @Override 
   public void displayEmployeeDetails(){
    super.displayEmployeeDetails();

        System.out.println("Employee ID is : " + employeeId);
        System.out.println("Employee name is : " + employeeName);
        System.out.println("Employee salary is : " + salary);

        System.out.println("Employee departement is : " + departement);
        System.out.println("Employee team size is : " + teamSize);
    
   }
}

public class employeeAndManagerRelation {
    public static void main(String[] args) {
        
        Manager obj = new Manager(101, "Adbulah", 30000, "Technical", 5);
        
        obj.displayEmployeeDetails();

    }
}
