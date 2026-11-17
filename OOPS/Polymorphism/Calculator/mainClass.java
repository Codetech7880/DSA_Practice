package OOPS.Polymorphism.Calculator;

public class mainClass {
    // This is our main class.
    public static void main(String[] args) {
        
        // Creating an object of another class in same package.
        claculatorClass obj = new claculatorClass();

        //Calling all methods.
        obj.calculate(10, 30);
        obj.calculate(10, 20, 30);
        obj.claculate(10.5, 20.5);
        obj.calculate(40, 10, '+');

    }
}
