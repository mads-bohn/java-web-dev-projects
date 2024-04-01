package org.launchcode;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner mileInput = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        int miles = mileInput.nextInt();

        Scanner gallonInput = new Scanner(System.in);
        System.out.println("How many gallons of gas did you use?");
        int gallons = gallonInput.nextInt();

        int milesPerGallon = miles / gallons;
        System.out.println("Your car gets " + milesPerGallon + " mpg");
    }
}
