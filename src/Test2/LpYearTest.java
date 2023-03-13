package Test2;

public class LpYearTest {
    public static void main(String[] args) {
       LpYear lpYear = new LpYear();
       boolean expectedResult = true;
       boolean actualResult = lpYear.isLeapYear(1988);

       if (expectedResult == actualResult) {
           System.out.println("Test passed!");
       } else {
           System.out.println("Test failed");
       }

    }
}
