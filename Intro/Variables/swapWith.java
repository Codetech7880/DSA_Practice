// Swap two variables using a temporary variable.

public class swapWith {
    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 20;
        int temp;

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("First number is : " + num1);
        System.out.println("Second number is : " + num2);

    }
}
