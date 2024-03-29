package Test2;

public class CalctTest {

    public static void main(String[] args) {
        Calct calct = new Calct();
        int expectedResult = 30;
        int realResult = calct.sum(20, 10);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test sum = FAIL");
        }
        int expectedResult1 = 10;
        int realResult1 = calct.sub(20, 10);
        if (realResult1 == expectedResult1) {
            System.out.println("Sub test  = OK");
        } else {
            System.out.println("Sub test  = FAIL");

        }
        int expectedResult2 = 200;
        int realResult2 = calct.multi(20, 10);
        if (realResult2 == expectedResult2) {
            System.out.println("Multi test  = OK");
        } else {
            System.out.println("Multi test  = FAIL");
        }
        int expectedResult3 = 2;
        int realResult3 = calct.div(20, 10);
        if (realResult3 == expectedResult3) {
            System.out.println("Div test  = OK");
        } else {
            System.out.println("Div test  = FAIL");
        }
        boolean evenNumber = true;
        boolean realNumber = calct.isEven(2);
        if (realNumber == evenNumber) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is not even");
        }
        int expectedMaxOfTwoNumber = 10;
        int actualMaxOfTwoNumbers = calct.maxOfTwoNumbers(10, 5);
        if (expectedMaxOfTwoNumber == actualMaxOfTwoNumbers) {
            System.out.println("Max number test for first number bigger than second is OK");
        } else {
            System.out.println("Max number test for first number bigger than second is FALSE");
        }


        expectedMaxOfTwoNumber = 5;
        actualMaxOfTwoNumbers = calct.maxOfTwoNumbers(4, 5);
        if (expectedMaxOfTwoNumber == actualMaxOfTwoNumbers) {
            System.out.println("Max number test for second number bigger than first is OK");
        } else {
            System.out.println("Max number test for second number bigger than first is FALSE");
        }


        expectedMaxOfTwoNumber = 3;
        actualMaxOfTwoNumbers = calct.maxOfTwoNumbers(3, 3);
        if (expectedMaxOfTwoNumber == actualMaxOfTwoNumbers) {
            System.out.println("Max number test for both numbers equal is OK");
        } else {
            System.out.println("Max number test for both numbers equal is FALSE");
        }
        Calct calc1 = new Calct();
        {
            int first = 10, second = 5, third = 20;
            int max = calc1.maxOfThree(first, second, third);
            System.out.println("Max of " + first + ", " + second + ", " + third + " is " + max);

            first = 15; second = 15; third = 15;
            max = calc1.maxOfThree(first, second, third);
            System.out.println("Max of " + first + ", " + second + ", " + third + " is " + max);

            first = 15; second = 15; third = 15;
            max = calc1.maxOfThree(first, second, third);
            System.out.println("Max of " + first + ", " + second + ", " + third + " is " + max);

            first = 15; second = 15; third = 15;
            max = calc1.maxOfThree(first, second, third);
            System.out.println("Max of " + first + ", " + second + ", " + third + " is " + max);
        }
    }
}
