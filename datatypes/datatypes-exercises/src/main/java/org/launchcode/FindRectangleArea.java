package org.launchcode;
import java.util.Scanner;
public class FindRectangleArea {
    public static void main(String[] args) {
        Scanner lengthInput = new Scanner(System.in);
        System.out.println("Enter rectangle length: ");
        int length = lengthInput.nextInt();

        Scanner widthInput = new Scanner(System.in);
        System.out.println("Enter rectangle width: ");
        int width = widthInput.nextInt();

        int area = length * width;
        System.out.println("The rectangle's area is " + area);
    }
}
