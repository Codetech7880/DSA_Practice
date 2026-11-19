package OOPS.Polymorphism.NotificationSystem;

// This is the main class.
public class MainClass {
    
    // This is the main execution where execution is happened.
    public static void main(String[] args) {
        
        // This is a parent class object that stores values of all child class object.
        Notification[] arr = new Notification[3];

        // Storing the value at every indexes.
        arr[0] = new EmailNotification();
        arr[1] = new SMSNotification();
        arr[2] = new PushNotification();

        // Printing all the values.
        for(int i = 0; i < arr.length; i++){
            arr[i].sendMessage();
        }

    }
}
