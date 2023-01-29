package Homework1.Additional;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first integer number");
        short a = scanner.nextShort();
        System.out.println("Enter second integer number");
        short b = scanner.nextShort();
        System.out.println("Enter third integer number");
        short c = scanner.nextShort();
        float average = (a + b + c) / 3f;
        System.out.println("Average is " + average);
    }
}
