package additionalHomework.addHomework3;

class LeapYearTest {
    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
        System.out.println("Leap year test");
        boolean expectedResult = false;
        boolean actualResult = leapYear.isLeapYear(2023);
        if (expectedResult == actualResult){
            System.out.println("Test is OK");
        }else {
            System.out.println("Test is FALSE");
        }
    }
}
