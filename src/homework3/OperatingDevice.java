package homework3;

import java.util.Scanner;

class OperatingDevice {
    public static void main(String[] args) {
        boolean device;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first temperature in Kelvin");
        long firstFlaskTemperature = scanner.nextLong();
        System.out.println("Enter second temperature in Kelvin");
        long secondFlaskTemperature = scanner.nextLong();
        if (firstFlaskTemperature > 100 && firstFlaskTemperature <= 1.417 * Math.pow(10,32) 
                && secondFlaskTemperature < 100 && secondFlaskTemperature > 0) {
            device = true;
            System.out.println("Device is operating? - '" + device + "'");
        } else if (firstFlaskTemperature > 1.417 * Math.pow(10,32) || secondFlaskTemperature <= 0) {
            System.out.println("Congratulations! You have broken the universe");
        } else {
            device = false;
            System.out.println("Device is operating? - '" + device + "'");
        }
    }
//----------------Почему-то при вводе огромных чисел выводит ошибку-----------------///
}
