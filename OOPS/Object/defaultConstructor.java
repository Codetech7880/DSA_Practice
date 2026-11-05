package OOPS.Object;

class students{
    public String name;
    public int id;
    public String departement;

    // This is default constructor --> created by guarbage collector.
    public students(){
        System.out.println("This is default constructor");
    }

    public void sleeping(){
        System.out.println(name + " is sleeping.");
    }
    public void studing(){
        System.out.println(name + " is studing.");
    }
    public void walking(){
        System.out.println(name + " is walking.");
    }
}

public class defaultConstructor {
    public static void main(String[] args) {
        
        // Method creation.
        students obj = new students();

        // Set values.
        obj.name = "Sachin";
        obj.id = 101;
        obj.departement = "Software developer";

        // Print values.
        System.out.println(obj.name);
        System.out.println(obj.id);
        System.out.println(obj.departement);

        // Method call
        obj.sleeping();
        obj.walking();;
        obj.studing();

    }
}
