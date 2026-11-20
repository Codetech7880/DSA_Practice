package OOPS.Abstraction.BirdLifeCycle;

// This is all normal class that extends abstract class.
public class Pigeon extends Bird {
    
    @Override 
    public void fly(){
        System.out.println("Pigeon also fly at an averge height.");
    }

    @Override 
    public void eat(){
        System.out.println("They eat bit by bit of food.");
    }

    public void looks(){
        System.out.println("Pigeon looks very beautiful.");
    }

}
