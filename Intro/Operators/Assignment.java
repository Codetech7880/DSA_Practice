package Intro.Operators;

public class Assignment {
    public static void main(String[] args) {
        
        // This " = " is the assignment operator.
        int num1 = 10;
        int num2 = 5;

        // This " += " operator first add some value and then assign it.
        System.out.println("Testing += operator : "+ (num1 += num2));

        // This " -= " operator first add some value and then assign it.
        System.out.println("Testing -= operator : "+ (num1 -= num2));

        // This " *= " operator first add some value and then assign it.
        System.out.println("Testing *= operator : "+ (num1 *= num2));

        // This " /= " operator first add some value and then assign it.
        System.out.println("Testing /= operator : "+ (num1 /= num2));

        // This " %= " operator first add some value and then assign it.
        System.out.println("Testing %= operator : "+ (num1 %= num2));



    }
}
