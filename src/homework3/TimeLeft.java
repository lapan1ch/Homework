package homework3;

import java.util.Scanner;

class TimeLeft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number in seconds");
        short seconds = scanner.nextShort();
        if (seconds >= 3600 && seconds <= 28800){
            byte workHours = (byte) (seconds / 3600);
            System.out.println("Time left to work is - '" + workHours + "' hour(s)");
        } else if (seconds >= 0 && seconds < 3600) {
            System.out.println("Time left to work is - less then an hour");
        } else {
            System.out.println("You have entered wrong number in seconds");
        }
    }
}
