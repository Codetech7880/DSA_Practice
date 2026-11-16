package OOPS.Inheritance.shapeCalculator;

public class circle extends shape{
    public float radius;

    public circle(float radius){
        this.radius = radius;
    }

    @Override
    public void findAreaOfShapes() {
        // TODO Auto-generated method stub
        super.findAreaOfShapes();

        float area = 3.14f * radius * radius;
        System.out.println("Area of a circle is : " + area);

    }
}
