package Intro.Operators;

public class Bitwise {
    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 20;
        boolean num3 = false;

        if(num1 == 10 && num2 == 15)
            System.out.println("Applying logical AND operator");
        else if(num1 == 10 || num2 == 15)
            System.out.println("Applying logical OR operator");
        else
            System.out.println("Testing successful");

        System.out.println(("The upper iteration is completed : " + !num3));

    }
}
