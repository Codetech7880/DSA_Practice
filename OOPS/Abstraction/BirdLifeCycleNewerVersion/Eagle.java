package OOPS.Abstraction.BirdLifeCycleNewerVersion;

public class Eagle implements Bird, Animal{
    
    public void fly(){
        System.out.println("Eagle flying at very high.");
    }
    public void eat(){
        System.out.println("Eagle is a carnivorous bird.");
    }
    public void walk(){
        System.out.println("Eagle walk when he attack for food.");
    }
    public void sound(){
        System.out.println("Eagle sound is very powerful.");
    }

}
