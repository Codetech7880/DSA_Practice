package OOPS.Polymorphism.AnimalSoundSystem;

public class mainClass {
    public static void main(String[] args) {

        // Creating an array object.        
        Animal[] arr = new Animal[4];

        // Initializing values at all indexes.
        arr[0] = new Dog();
        arr[1] = new Cat();
        arr[2] = new Cow();
        arr[3] = new Lion();

        // Printing all values.
        for(int i = 0; i < arr.length; i++){
            arr[i].makeSound();
        }

    }
}
