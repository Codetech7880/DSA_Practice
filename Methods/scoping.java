package Methods;

import java.util.Scanner;

public class scoping {

    static void scopingCheck(int num) {
        System.out.println("This is in scopingCkeck container " + num);
        System.out.println("This is in scopingCkeck container " + (num * 10));
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Taking the variable from the users.
        System.out.print("Enter the number :");
        int num = sc.nextInt();

        System.out.println("This is in main block " + num);
        scopingCheck(num);
        System.out.println("This is in main block " + num);

    }
}
