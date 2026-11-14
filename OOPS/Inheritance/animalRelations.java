package OOPS.Inheritance;

class Animals{
    public void eat(){
        System.out.println("Animals eats food.");
    }
    public void sleep(){
        System.out.println("Animal sleep");
    }
}
class Dog extends Animals{
    public void bark(){
        eat();
        sleep();
        System.out.println("Dog barks");
    }
}
class Cat extends Animals{
    public void meow(){
        eat();
        sleep();
        System.out.println("Cat meows");
    }
}

public class animalRelations {
    public static void main(String[] args) {
        
        Dog obj1 = new Dog();
        Cat obj2 = new Cat();

        obj1.bark();
        obj2.meow();

    }
}
