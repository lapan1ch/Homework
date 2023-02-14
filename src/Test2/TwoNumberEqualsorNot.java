package Test2;

import java.util.Scanner;

public class TwoNumberEqualsorNot {

    public static void main(String[] args) {

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter first number - ");
        int firstnumber = sc2.nextInt();
        System.out.println("Enter second number - ");
        int secondnumber = sc2.nextInt();

        if (firstnumber == secondnumber){
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }

    }
}
