package OOPS.Abstraction.ShapeCalculator;

import java.util.Scanner;

public class Square extends Shape{
    
    @Override 
    public void calculateAres(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of a square : ");
        float side = sc.nextFloat();
        float areaOfSquare = side * side;
        System.out.println("Area of rectangle is : " + areaOfSquare);
    }
    
    @Override 
    public void claculatePerimeter(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of a square : ");
        float side = sc.nextFloat();
        float perimeterOfSquare = 4 * side ;
        System.out.println("Area of rectangle is : " + perimeterOfSquare);
    }

}
