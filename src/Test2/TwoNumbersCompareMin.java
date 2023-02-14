package Test2;

import java.util.Scanner;

public class TwoNumbersCompareMin {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("First number  - ");
        int number1 = sc1.nextInt();
        System.out.println("Second number  - ");
        int number2 = sc1.nextInt();

        if(number1 < number2){
            System.out.println("First number less than second - " + number1);
        }else {
            System.out.println("Second number less than first - " + number2);
        }
    }

}
