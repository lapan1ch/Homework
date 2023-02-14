package Test2;

import java.util.Scanner;

public class ThreeNumbersIncorDec {

    public static void main(String[] args) {

        Scanner sc4 = new Scanner(System.in);
        System.out.println("First - ");
        int n = sc4.nextInt();
        System.out.println("Second - ");
        int n1 = sc4.nextInt();
        System.out.println("Third - ");
        int n2 = sc4.nextInt();
        if (n < n1 && n1 < n2){
            System.out.println("Increasing numbers");
        } else if (n > n1 && n1 > n2) {
            System.out.println("Decreasing numbers");
        }else {
            System.out.println("Neither increasing or decreasing numbers");
        }

    }
}
