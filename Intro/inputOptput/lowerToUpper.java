package Intro.inputOptput;

import java.util.Scanner;

public class lowerToUpper {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String userName = sc.nextLine();

        String convertTOUpper = userName.toUpperCase();
        System.out.println("Your name in Upper Case : " + convertTOUpper);

    }
}
