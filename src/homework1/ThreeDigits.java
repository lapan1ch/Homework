package homework1;

import java.util.Scanner;

class ThreeDigits {
        short aThreeDigitNumber;
        short inputAThreeDigitNumber() {
                System.out.println("Enter a three digit integer number");
                Scanner scanner = new Scanner(System.in);
                return scanner.nextShort();
        }
        void breakAThreeDigitNumber(){
        int firstDigit = aThreeDigitNumber / 100;
        int secondDigit = aThreeDigitNumber / 10 % 10;
        int thirdDigit = aThreeDigitNumber % 10;
        System.out.println("First digit is - " + Math.abs(firstDigit));
        System.out.println("Second digit is - " + Math.abs(secondDigit));
        System.out.println("Third digit is - " + Math.abs(thirdDigit));
    }
}