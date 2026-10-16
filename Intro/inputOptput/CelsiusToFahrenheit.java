package Intro.inputOptput;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature in degree celsius : ");
        int celsius = sc.nextInt();

        int Fahrenheit = (celsius * ( 9 / 5 )) + 32;

        System.out.println("Temperature in Fahrenheit is : " + Fahrenheit);

    }
}
