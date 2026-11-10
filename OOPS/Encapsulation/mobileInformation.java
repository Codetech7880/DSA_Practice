package OOPS.Encapsulation;

class Mobile{
    private String brand;
    private String model;
    private int price;

    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }

    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }

    public void setPrice(int price){
        if(price > 0){
            this.price = price;
        }
    }
    public int getPrice(){
        return price;
    }

    public void chargeBattery(int percentage){
        if(percentage >= 0 && percentage <= 100){
            System.out.println("Battery percentage is : " + percentage);
        }else{
            System.out.println("Invalid cridentials!");
        }
    }
}

public class mobileInformation {
    public static void main(String[] args) {
        
        Mobile obj = new Mobile();

        obj.setBrand("Samsung");
        obj.setModel("S25 Ultra");
        obj.setPrice(120000);

        System.out.println("Mobile brand : " + obj.getBrand());
        System.out.println("Mobile model : " + obj.getModel());
        System.out.println("Mobile price : " + obj.getPrice());

        obj.chargeBattery(45);

    }
}
