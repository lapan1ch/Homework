public class ThreeDigits {
    public static void main(String[] args) {
        short a = 123;
        int firstDigit = a / 100;
        int secondDigit = a / 10 % 10;
        int thirdDigit = a % 10;
        System.out.println("First digit is - " + firstDigit);
        System.out.println("Second digit is - " + secondDigit);
        System.out.println("Third digit is - " + thirdDigit);
    }
}
 ////-------Почему нельзя поставить везде short?---------/////