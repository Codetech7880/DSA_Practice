package OOPS.Polymorphism.NotificationSystem;

// This is a child class that extends to the parent class.
public class EmailNotification extends Notification{
    
    // Method override.
    @Override 
    public void sendMessage(){
        // Printing the output.
        System.out.println("Email Notification.");

    }

}
