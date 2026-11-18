package OOPS.Polymorphism.AnimalSoundSystem;

public class Cow extends Animal {

    // Method override.
    @Override 
    public void makeSound(){

        // This indicates the makeSound() of parent class.
        super.makeSound();

        System.out.println("Cow moos");
        
    }
}
