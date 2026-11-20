package OOPS.Abstraction.BirdLifeCycleNewerVersion;

public class MainMethod {

    public static void BirdQualtiy(Bird b){
        b.fly();
        b.eat();
    }
    public static void animalQuality(Animal A){
        A.walk();
        A.sound();
    }

    public static void main(String[] args) {
        
        BirdQualtiy(new Eagle());
        BirdQualtiy(new Pigeon());
        BirdQualtiy(new Sparrow());

        animalQuality(new Eagle());

    }    
}
