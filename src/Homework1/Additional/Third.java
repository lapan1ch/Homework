package Homework1.Additional;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        System.out.println("Test Data:");
        System.out.println("Input a number:");
        Scanner scanner = new Scanner(System.in);
        byte a = scanner.nextByte();
        System.out.println("Expected output:");
        System.out.println(a + " x 1 =" + a);
        System.out.println(a + " x 2 =" + a*2);
        System.out.println(a + " x 3 =" + a*3);
        System.out.println(a + " x 4 =" + a*4);
        System.out.println(a + " x 5 =" + a*5);
        System.out.println(a + " x 6 =" + a*6);
        System.out.println(a + " x 7 =" + a*7);
        System.out.println(a + " x 8 =" + a*8);
        System.out.println(a + " x 9 =" + a*9);
        System.out.println(a + " x 10 =" + a*10);
    }
}
