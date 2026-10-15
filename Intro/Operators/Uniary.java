package Intro.Operators;

public class Uniary {
    public static void main(String[] args) {
        
        int num = 10;

        // num = -10
        // Makes values as negative
        System.out.println("Printing negative vale : " + -num);
        
        // num = 10
        // Makes all neagtive value as positive
        System.out.println("Printing positive vale : " + +num);

        // num = 10
        // num++ --> It first print the value than increse it.
        System.out.println("Using increment operator : " + num++);

        // num = 11
        // num-- --> It first print the value than decrese it.
        System.out.println("Using decrement operator : " + num--);

        // num = 11
        // ++num --> It first increase the value and than print it.
        System.out.println("Using increment operator : " + ++num);

        // num = 10
        // --num --> It first decrese the value and than print it.
        System.out.println("Using decrement operator : " + --num);

    }
}
