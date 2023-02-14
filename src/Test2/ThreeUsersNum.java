package Test2;

import java.util.Scanner;

public class ThreeUsersNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number is - ");
        int num1 = scanner.nextInt();
        System.out.println("Second number is - ");
        int num2 = scanner.nextInt();
        System.out.println("Third number is - ");
        int num3 = scanner.nextInt();
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println("The largest number is " + max);

    }

}
