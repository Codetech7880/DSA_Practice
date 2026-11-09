package OOPS.Encapsulation;

class employee{

    // Creating private variables.
    private String employeeName;
    private int employeeId;
    private int salary;

    // Creating getter and setter method.
    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }
    public String getEmployeeName(){
        return employeeName;
    }

    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }
    public int getEmployeeId(){
        return employeeId;
    }

    public void setSalary(int salary){
        if(salary > 0){
            this.salary = salary;
        }
    }
    public int getSalary(){
        return salary;
    }

}

public class employeeInformation {
    public static void main(String[] args) {
        
        // Initializing an object.
        employee obj = new employee();

        // Set values of all variables.
        obj.setEmployeeId(101);
        obj.setEmployeeName("Sakshi");
        obj.setSalary(-1000);

        // Print all values 
        System.out.println("Employee ID : " + obj.getEmployeeId());
        System.out.println("Employee name : " + obj.getEmployeeName());
        System.out.println("Employee salary : " + obj.getSalary());

    }
}
