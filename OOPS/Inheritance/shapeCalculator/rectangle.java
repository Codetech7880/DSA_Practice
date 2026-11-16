package OOPS.Inheritance.shapeCalculator;

public class rectangle extends shape {
    public float length;
    public float width;

    public rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }

    @Override
    public void findAreaOfShapes() {
        // TODO Auto-generated method stub
        super.findAreaOfShapes();

        float area = length * width;
        System.out.println("Area of rectangle is : " + area);
    }
}
