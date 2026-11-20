package OOPS.Abstraction.BirdLifeCycle;

// This is all normal class that extends abstract class.
public class Sparrow extends Bird {
    
    @Override 
    public void fly(){
        System.out.println("Sparrow fly at an average height.");
    }

    @Override 
    public void eat(){
        System.out.println("Sparrow eat only a bit of food.");
    }

}
