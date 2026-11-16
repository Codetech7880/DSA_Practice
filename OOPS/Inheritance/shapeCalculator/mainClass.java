package OOPS.Inheritance.shapeCalculator;

public class mainClass {
    public static void main(String[] args) {
        circle obj1 = new circle(24);
        rectangle obj2 = new rectangle(12,3);
        square obj3 = new square(12);

        obj1.findAreaOfShapes();
        obj2.findAreaOfShapes();
        obj3.findAreaOfShapes();
    }    
}
