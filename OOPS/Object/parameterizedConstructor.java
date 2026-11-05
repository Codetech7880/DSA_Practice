package OOPS.Object;

class car{
    public String carName;
    public int marketPrice;
    public String carModel;

    // This is a example of parameterized constructor
    public car(String carName, int marketPrice, String carModel){
        this.carName = carName;
        this.marketPrice = marketPrice;
        this.carModel = carModel;
    }

    public void electric(){
        System.out.println("This is a electric car.");
    }
}

public class parameterizedConstructor {
    public static void main(String[] args) {
        
        car obj1 = new car("Sujuki", 1000000, "Creta");
        car obj2 = new car("Mahindra", 1500000, "Thor");

        System.out.println(obj1.carName);
        System.out.println(obj2.carName);
        System.out.println(obj1.carModel);
        System.out.println(obj2.carModel);

        obj1.electric();

    }
}
