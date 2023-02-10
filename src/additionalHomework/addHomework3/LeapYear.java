package additionalHomework.addHomework3;

class LeapYear {
    public boolean isLeapYear(int year){
        return year % 400 == 0 || year % 100 == 0 || year % 4 == 0;
    }
}
