package OOPS.Encapsulation;

class ATM{
    // Creating a private variable.
    private int pin;
    private int balance;

    // Creating a constructor for pin to set values.
    public ATM(int pin){
        this.pin = pin;
    }

    // Creating a getter and setter method for balance to set there values.
    public void setBalance(int balance){
        this.balance = balance;
    }
    public int getBalance(){
        return balance;
    }

    // Creating a method change pin.
    public void changePin(int oldPin, int newPin){
        // Verifying pin with your older pin
        if(oldPin == pin){
            pin = newPin;
            System.out.println("Pin changed sucessfully!!");
        }else{
            System.out.println("Incurrect pin");
        }
    }

    // Creating a check balance method.
    public void checkBalance(int enteredPin){
        // Authenticate your pin if pin is correct than balance shown otherwise not.
        if(enteredPin == pin){
            System.out.println("Your blanace is : " + balance);
        }else{
            System.out.println("Incurrect pin");
        }
    }

    // Creating a withdraw mwthod.
    public void withdraw(int enteredPin, double amount){
        // Authenticate your pin.
        if(enteredPin == pin){
            // Authenticate your balance.
            if(balance < amount){
                System.out.println("Insufficient bank balance");
            }else{
                balance -= amount;
                System.out.println("You are sucessfully withdraw : " + amount);
                System.out.println("Your avilable balance is : " + balance);
            }
        }else{
            System.out.println("Incurrect pin!!!");
        }
    }
}

public class atmInformation {
    public static void main(String[] args) {
        
        ATM obj = new ATM(54321);

        obj.setBalance(5000);
        obj.getBalance();

        obj.changePin(3456, 87654);
        obj.checkBalance(54321);
        obj.withdraw(54321, 2000);

    }
}
