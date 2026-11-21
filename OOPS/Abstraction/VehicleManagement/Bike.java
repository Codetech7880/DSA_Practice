package OOPS.Abstraction.VehicleManagement;

public class Bike extends Vehicle {
    
    @Override 
    public void startEngine(){
        System.out.println("Bike engine starting.");
    }
    
    @Override 
    public void stopEngine(){
        System.out.println("Bike engine stop.");
    }

}
