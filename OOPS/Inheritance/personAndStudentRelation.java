package OOPS.Inheritance;

import java.util.Scanner;

// This is a parent class
class Person{
    public String name;
    public int age;

    public void setDetails(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name : ");
        name = sc.nextLine();

        System.out.print("Enter age : ");
        age = sc.nextInt();
    }
    public void displayDetails(){
        System.out.println("Person's name is : " + name);
        System.out.println("Person's age is : " + age);
    }
}

// This is a child class.
class Student extends Person{
    public int rollNumber;
    public String course;

    // It inherit setDetails method form its parents.
    @Override 
    public void setDetails() {
        super.setDetails();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter roll number : ");
        rollNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter course name : ");
        course = sc.nextLine();
    }

    // It inherit setDetails method form its parents.
    @Override
    public void displayDetails() {
        super.displayDetails();

        System.out.println("Student's roll number is : " + rollNumber);
        System.out.println("Student's course is : " + course);

    }
}

public class personAndStudentRelation {
    public static void main(String[] args) {
        
        // Creating a object refernece.
        Student obj = new Student();

        // Method call by object reference.
        obj.setDetails();
        obj.displayDetails();

    }
}
