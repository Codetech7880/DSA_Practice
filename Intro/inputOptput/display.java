package Intro.inputOptput;

import java.util.Scanner;

public class display {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any sentencs : ");
        String sent = sc.nextLine();

        for(int i = 1; i <= 3; i++){
            System.out.println(sent);
        }

    }
}
