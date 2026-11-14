package OOPS.Inheritance;

class Vehicle{
    public String brand;
    public String model;
    public int speed;

    public void start(){
        System.out.println("Vehicle starts when engine starts.");
    }
    public void stop(){
        System.out.println("Vehicle stops when break applied.");
    }
}
class Car extends Vehicle{

    public Car(String brand, String model, int speed){
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    public void numberOfDoors(){
        System.out.println("Car brand is : " + brand);
        System.out.println("Car model is : " + model);
        System.out.println("Car spees is : " + speed);
        System.out.println("Car has four doors.");
        start();
        stop();
    }
}
class Bike extends Vehicle{

    public Bike(String brand, String model, int speed){
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    public void hasGear(){
        System.out.println("Bike brand is : " + brand);
        System.out.println("Bike model is : " + model);
        System.out.println("Bike spees is : " + speed);
        System.out.println("Bike has a gear.");
        start();
        stop();
    }
}
class Truck extends Vehicle{

    public Truck(String brand, String model, int speed){
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    public void loadCapacity(){
        System.out.println("Truck brand is : " + brand);
        System.out.println("Truck model is : " + model);
        System.out.println("Truck spees is : " + speed);
        System.out.println("Truck has 100Ton load capacity.");
        start();
        stop();
    }
}

public class vehicleManagement {
    public static void main(String[] args) {
        
        Car obj1 = new Car("Suzuki", "Indica 2010", 240);
        Bike obj2 = new Bike("Bajaj", "Pulsur", 180);
        Truck obj3 = new Truck("Ashoka Leyland", "2024 model", 160);

        obj1.numberOfDoors();
        obj2.hasGear();
        obj3.loadCapacity();

    }
}
