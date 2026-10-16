package Intro.inputOptput;

import java.util.Scanner;

public class indexCount {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sentence : ");
        String sentence = sc.nextLine();
        int count = 0;

        for(int i = 1; i <= sentence.length(); i++){
            count++;
        }
        System.out.println(count);

    }
}
