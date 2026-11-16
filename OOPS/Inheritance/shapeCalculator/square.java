package OOPS.Inheritance.shapeCalculator;

public class square extends shape {
    public float sideLength;

    public square(float sideLength){
        this.sideLength = sideLength;
    }
    
    @Override
    public void findAreaOfShapes() {
        // TODO Auto-generated method stub
        super.findAreaOfShapes();

        float area = sideLength * sideLength;
        System.out.println("Area of square is : " + area);
    }
}
