package Test2;

public class LpYear {


    boolean isLeapYear;


    public boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            // год не делится на 4, значит он обычный
            return false;
        } else if (year % 100 != 0) {
            // год делится на 4, но не делится на 100, значит он високосный
            return true;
        } else if (year % 400 != 0) {
            // год делится на 100, но не делится на 400, значит он обычный
            return false;
        } else {
            // год делится на 400, значит он високосный
            return true;
        }
    }
}
