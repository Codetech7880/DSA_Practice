package Intro.loops;

import java.util.Scanner;

public class printPrime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        if (n > 1) {

            for (int i = 2; i <= n; i++) {
                boolean isPrime = true;

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.println(i + " is prime");
                } else {
                    System.out.println(i + " is not prime");
                }
            }

        } else {
            System.out.println("Please enter a number greater than 1.");
        }

        sc.close();
    }
}
