package OOPS.Object;

class Student{
    String name;
    int id;
    int salary;

    public void sleep(){
        System.out.println(name + " is sleeping.");
    }
    public void totalSalary(){
        System.out.println(salary + " is the total salary.");
    }
}

public class createAnObject {
    public static void main(String[] args) {
        // Creating an object.
        Student obj = new Student();

        // Initializing values in the above object.
        obj.name = "Sachin";
        obj.id = 101;
        obj.salary = 40000;

        // Method calling.
        obj.sleep();
        obj.totalSalary();
    }
}
