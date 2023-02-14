package Test2;

public class CalctTest {

    public static void main(String[] args) {
        Calct calct = new Calct();
        int expectedResult = 30;
        int realResult = calct.sum(20, 10);
        if (realResult == expectedResult) {
            System.out.println("Sum test sum = OK");
        } else {
            System.out.println("Sum test sum = FAIL");
        }
        int expectedResult1 = 10;
        int realResult1 = calct.sub(20, 10);
        if (realResult == expectedResult) {
            System.out.println("Sum test sub = OK");
        } else {
            System.out.println("Sum test sub = FAIL");

        }
        int expectedResult2 = 200;
        int realResult2 = calct.multi(20, 10);
        if (realResult == expectedResult) {
            System.out.println("Sum test multi = OK");
        } else {
            System.out.println("Sum test multi = FAIL");
        }
        int expectedResult3 = 2;
        int realResult3 = calct.div(20, 10);
        if (realResult == expectedResult) {
            System.out.println("Sum test div = OK");
        } else {
            System.out.println("Sum test div = FAIL");
        }
        boolean evenNumber = true;
        boolean realNumber = calct.isEven(2);
        if (realNumber == evenNumber) {
            System.out.println("Number is even");
        }
        int expectedMaxofTwoNumbers = 20;
        int realResultofTwoNumbers = calct.compare(20,20);
        if (expectedMaxofTwoNumbers == realResultofTwoNumbers) {
            System.out.println("Max number test = OK");
        } else {
            System.out.println("Max number test = FAIL");
        }
    }
}
