package additionalHomework.addHomework3;

import java.util.Scanner;

class LargerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first unique integer number");
        long firstNumber = scanner.nextLong();
        System.out.println("Enter second unique integer number");
        long secondNumber = scanner.nextLong();
        System.out.println("Enter third unique integer number");
        long thirdNumber = scanner.nextLong();
        if (firstNumber == secondNumber || firstNumber == thirdNumber || secondNumber == thirdNumber){
            System.out.println("Numbers are not unique");
        } else if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("Largest number is - '" + firstNumber +"'");
        } else if (secondNumber > thirdNumber) {
            System.out.println("Largest number is - '" + secondNumber +"'");
        } else {
            System.out.println("Largest number is - '" + thirdNumber +"'");
        }
    }
}
//-----------------------------Почему нет ограничения по 'if-else'?---------------------//