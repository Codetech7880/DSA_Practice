package Intro.inputOptput;

import java.util.Scanner;

public class simpleIntrest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of Princliple : ");
        int principle = sc.nextInt();

        System.out.print("Enter value of Rate : ");
        int rate = sc.nextInt();

        System.out.print("Enter value of Time : ");
        int time = sc.nextInt();

        int SI = (principle * rate * time) / 100;

        System.out.println("The simple intrest is : " + SI);

    }
}
