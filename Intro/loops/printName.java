package Intro.loops;

import java.util.Scanner;

public class printName {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String userName = sc.nextLine();

        for(int i = 1; i <= 100; i++){
            System.out.println("Your name is : "+ userName);
        }

    }
}
