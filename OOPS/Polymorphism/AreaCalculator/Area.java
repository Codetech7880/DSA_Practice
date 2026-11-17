package OOPS.Polymorphism.AreaCalculator;

public class Area {
    
    // Creating calculate method with the help of method overloading.
    // Finding the area of square.
    public void calculateArea(int side){
        int areaOfSquare = side * side;
        System.out.println("Area of square is : " + areaOfSquare);
    }

    // Finding the area of rectangle.
    public void calculateArea(int length, int width){
        int area = length * width;
        System.out.println("Area of rectangle is : " + area);
    }

    // Finding the area of circle.
    public void calculateArea(float radius){
        float area = 3.14f * radius * radius;
        System.out.println("Area of circle is : " + area);
    }

}
