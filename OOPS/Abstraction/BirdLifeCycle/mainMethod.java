package OOPS.Abstraction.BirdLifeCycle;

public class mainMethod {
    public static void main(String[] args) {
        
        Bird obj1 = new Sparrow();
        Eagle obj2 = new Eagle();
        Pigeon obj3 = new Pigeon();

        obj1.fly();
        obj1.eat();

        obj2.fly();
        obj2.eat();
        obj2.nature();

        obj3.fly();
        obj3.eat();
        obj3.looks();

    }
}
