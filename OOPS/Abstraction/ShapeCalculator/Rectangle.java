package OOPS.Abstraction.ShapeCalculator;

import java.util.Scanner;

public class Rectangle extends Shape{
    
    @Override 
    public void calculateAres(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle : ");
        float length = sc.nextFloat();
        System.out.print("Enter the width of the rectangle : ");
        float width = sc.nextFloat();
        float areaOfRectanngle = length * width;
        System.out.println("Area of rectangle is : " + areaOfRectanngle);
    }
    
    @Override 
    public void claculatePerimeter(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle : ");
        float length = sc.nextFloat();
        System.out.print("Enter the width of the rectangle : ");
        float width = sc.nextFloat();
        float perimeterOfRectanngle = 2*(length + width);
        System.out.println("Area of rectangle is : " + perimeterOfRectanngle);
    }

}
