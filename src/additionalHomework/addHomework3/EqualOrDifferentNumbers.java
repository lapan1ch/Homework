package additionalHomework.addHomework3;

import java.util.Scanner;

class EqualOrDifferentNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first unique integer number");
        long firstNumber = scanner.nextLong();
        System.out.println("Enter second unique integer number");
        long secondNumber = scanner.nextLong();
        System.out.println("Enter third unique integer number");
        long thirdNumber = scanner.nextLong();
        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            System.out.println("All numbers are equal");
        } else if (firstNumber != secondNumber && firstNumber != thirdNumber && secondNumber != thirdNumber) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither are equal or different");
        }
    }
}
