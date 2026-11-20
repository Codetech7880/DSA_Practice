package OOPS.Abstraction.BirdLifeCycle;

// This is all normal class that extends abstract class.
public class Eagle extends Bird {
    
    @Override 
    public void fly(){
        System.out.println("Eagle fly very high.");
    }

    @Override 
    public void eat(){
        System.out.println("Eagle is carnivorous.");
    }

    public void nature(){
        System.out.println("Eagle have fearless nature.");
    }

}
