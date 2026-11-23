package OOPS.Abstraction.EmployeeSalaryManagement;

abstract class Employee {
    public int EmployeeId;
    public String EmploeeName;

    Employee(int EmployeeId, String EmploeeName){
        this.EmployeeId = EmployeeId;
        this.EmploeeName = EmploeeName;
    }

    abstract void calculateSalary();
    public void dispalyDetails(){
        System.out.println("This method display all details.");
    }
}
