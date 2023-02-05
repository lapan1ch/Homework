package homework3;

import java.util.Scanner;

class WeekendWalkWithClearSky {
    public static void main(String[] args) {
        boolean canWalk;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is it weekend?");
        boolean isWeekEnd = scanner.nextBoolean();
        System.out.println("Is it raining?");
        boolean isRain = scanner.nextBoolean();
        if (isWeekEnd && !isRain){
            canWalk = true;
        } else {
            canWalk = false;
        }
        System.out.println("Can we go for a walk? -'" + canWalk + "'");
    }
}
