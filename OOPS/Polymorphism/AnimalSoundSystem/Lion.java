package OOPS.Polymorphism.AnimalSoundSystem;

public class Lion extends Animal{

    // Method override.
    @Override 
    public void makeSound(){

        // Super keyword helps us to indicate the makeSound() of parent class.
        super.makeSound();

        System.out.println("Lions roar");
        
    }
}
