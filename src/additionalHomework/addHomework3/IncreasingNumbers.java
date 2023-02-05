package additionalHomework.addHomework3;

import java.util.Scanner;

class IncreasingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first unique integer number");
        long firstNumber = scanner.nextLong();
        System.out.println("Enter second unique integer number");
        long secondNumber = scanner.nextLong();
        System.out.println("Enter third unique integer number");
        long thirdNumber = scanner.nextLong();
        if (firstNumber < secondNumber && secondNumber < thirdNumber) {
            System.out.println("increasing");
        } else if (firstNumber > secondNumber && secondNumber > thirdNumber) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither is increasing or decreasing order");
        }
    }
}
