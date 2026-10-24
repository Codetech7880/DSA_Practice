package Methods;

public class overLoading {

    static void display(int number){
        System.out.println("Your entered number is : " + number);
    }

    static void display(String name){
        System.out.println("Welcome " + name);
    }

    public static void main(String[] args) {
        
        display(78);
        display("Sachin");

    }
}
