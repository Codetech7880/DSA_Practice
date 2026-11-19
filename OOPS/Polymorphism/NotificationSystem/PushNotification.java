package OOPS.Polymorphism.NotificationSystem;

// THis is a child class that extends to the parent class.
public class PushNotification extends Notification{
    
    // Methoid overriding.
    @Override 
    public void sendMessage(){
        // Printing output.
        System.out.println("Push Message");

    }

}
