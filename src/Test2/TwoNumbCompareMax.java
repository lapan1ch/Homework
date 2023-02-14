package Test2;

import java.util.Scanner;

public class TwoNumbCompareMax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number - ");
        int numb1 = sc.nextInt();
        System.out.println("Enter second number - ");
        int numb2 = sc.nextInt();

        if (numb1 > numb2) {
            System.out.println("First number bigger then second - " + numb1);
        } else {
            System.out.println("Second number bigger then first - " + numb2);
        }

         }
    }