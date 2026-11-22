package OOPS.Abstraction.EmployeeSalaryManagement;

abstract class Employee {
    private int EmployeeId;
    private String EmploeeName;

    Employee(int EmployeeId, String EmploeeName){
        this.EmployeeId = EmployeeId;
        this.EmploeeName = EmploeeName;
    }

    abstract void calculateSalary();
    public void dispalyDetails(){

    }
}
