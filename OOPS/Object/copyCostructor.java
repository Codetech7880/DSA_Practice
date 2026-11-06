package OOPS.Object;

class Animals{
    public String animalName;
    public String animalBreed;
    public int priceInBlackMarket;

    public Animals(String animalName, String animalBreed, int priceInBlackMarket){
        this.animalName = animalName;
        this.animalBreed = animalBreed;
        this.priceInBlackMarket = priceInBlackMarket;
    }

    public Animals(Animals anml){
        this.animalName = anml.animalName;
        this.animalBreed = anml.animalBreed;
        this.priceInBlackMarket = anml.priceInBlackMarket;
    }

    public void forestAnimal(){
        System.out.println("This animal is mainly found in forests.");
    }
}

public class copyCostructor {
    public static void main(String[] args) {
        
        Animals obj1 = new Animals("Dear", "Golden-Brown", 200000);

        Animals obj2 = new Animals(obj1);
        System.out.println("This is an example of copy constructor.");

        System.out.println("Animal name : " + obj2.animalName);
        System.out.println("Animal breed : " + obj2.animalBreed);
        System.out.println("Price in black market : " + obj2.priceInBlackMarket);

        obj2.forestAnimal();

    }
}
