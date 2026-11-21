package OOPS.Abstraction.VehicleManagement;

public class Truck extends Vehicle {
    
    @Override 
    public void startEngine(){
        System.out.println("Truck engine starting.");
    }
    
    @Override 
    public void stopEngine(){
        System.out.println("Truck engine stop.");
    }

}
