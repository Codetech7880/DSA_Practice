package OOPS.Abstraction.VehicleManagement;

public class MainMethod {
    public static void main(String[] args) {
        
        Car obj1 = new Car();
        Bike obj2 = new Bike();
        Truck obj3 = new Truck();

        obj1.startEngine();
        obj1.stopEngine();
        
        obj2.startEngine();
        obj2.stopEngine();
        
        obj3.startEngine();
        obj3.stopEngine();

    }    
}
