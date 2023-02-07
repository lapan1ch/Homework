package Hmwk3;

public class WalkingWeekend {
    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean isRain = false;

        if (isWeekend && !isRain) {
            boolean canWalk = true;
            System.out.println("Идём гулять!");
        } else {
            boolean canWalk = false;
            System.out.println("Сидим дома, в следующий раз!");
        }
    }
}
