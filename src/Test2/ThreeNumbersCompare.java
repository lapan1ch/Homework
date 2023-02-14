package Test2;

import java.util.Scanner;

public class ThreeNumbersCompare {
    public static void main(String[] args) {


        Scanner sc3 = new Scanner(System.in);
        System.out.println("First is -");
        long first = sc3.nextInt();
        System.out.println("Second is - ");
        long second = sc3.nextInt();
        System.out.println("Third is - ");
        long third = sc3.nextInt();

        if (first == second && first == third){
            System.out.println("All numbers are equal");
        } else if (first != second && first != third && second !=third){
            System.out.println("All numbers are different");
        }else {
            System.out.println("Neither all are equal or different");    }
    }
}
