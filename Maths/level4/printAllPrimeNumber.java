package Maths.level4;

import java.util.Scanner;

public class printAllPrimeNumber {

    // Method to check prime number
    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {

            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        // Finding all prime numbers from 1 to N
        for (int i = 2; i <= n; i++) {

            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}