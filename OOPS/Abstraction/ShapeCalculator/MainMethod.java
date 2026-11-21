package OOPS.Abstraction.ShapeCalculator;

public class MainMethod {
    public static void main(String[] args) {
        
        Circle obj1 = new Circle();
        Rectangle obj2 = new Rectangle();
        Square obj3 = new Square();

        obj1.calculateAres();
        obj1.claculatePerimeter();

        obj2.calculateAres();
        obj2.claculatePerimeter();

        obj3.calculateAres();
        obj3.claculatePerimeter();

    }    
}
