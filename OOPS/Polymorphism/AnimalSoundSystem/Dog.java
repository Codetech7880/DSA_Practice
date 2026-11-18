package OOPS.Polymorphism.AnimalSoundSystem;

public class Dog extends Animal{

    // Method override
    @Override 
    public void makeSound(){
        // It indicates the makeSound() in parent class.
        super.makeSound();

        System.out.println("Dog barks");
        
    }
}
