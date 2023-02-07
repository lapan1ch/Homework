package Hmwk3;

import java.util.Scanner;

public class TemperatureDevice {
    public static void main(String[] args) {
        boolean device;
        int temperature1;
        int temperature2;

        Scanner scanner  = new Scanner(System.in);
        System.out.println("Temperature 1 - ");
        temperature1 = scanner.nextInt();
        System.out.println("Temperature 2 -");
        temperature2 = scanner.nextInt();

        if (temperature1>100 && temperature2<100){
            device = true;
        } else {
            device = false;
        }
        System.out.println(device);
    }
}
