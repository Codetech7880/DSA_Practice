package OOPS.Abstraction.ShapeCalculator;

import java.util.Scanner;

public class Circle extends Shape {
    
    @Override 
    public void calculateAres(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        float radius = sc.nextFloat();
        float areaOfCircle = 3.14f * radius * radius;
        System.out.println("Area of circle is : " + areaOfCircle);
    }

    @Override 
    public void claculatePerimeter(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle : ");
        float radius = sc.nextFloat();
        float perimeterOfCircle = 2 * 3.14f * radius;
        System.out.println("Perimeter of circle : " + perimeterOfCircle);
    }

}
