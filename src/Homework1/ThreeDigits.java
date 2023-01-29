package Homework1;

public class ThreeDigits {
    public static void main(String[] args) {
        InputAThreeDigitNumber inputAThreeDigitNumber = new InputAThreeDigitNumber();
        System.out.println("Enter a three digit integer number");
        short x = inputAThreeDigitNumber.aThreeDigitNumber();
        int firstDigit = x / 100;
        int secondDigit = x / 10 % 10;
        int thirdDigit = x % 10;
        System.out.println("First digit is - " + Math.abs(firstDigit));
        System.out.println("Second digit is - " + Math.abs(secondDigit));
        System.out.println("Third digit is - " + Math.abs(thirdDigit));
    }
}
