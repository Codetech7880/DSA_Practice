package OOPS.Polymorphism.AreaCalculator;

public class mainClass {
    // This is our main class.
    public static void main(String[] args) {
        
        // Creating an object of another class in same package.
        Area obj = new Area();

        // Calling methods.
        obj.calculateArea(10);
        obj.calculateArea(20, 30);
        obj.calculateArea(24.5f);

    }
}
