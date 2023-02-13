package homework4;

import java.util.Arrays;

class RandomFive {
    public static void main(String[] args) {
        byte[] randomNumbers = new byte[5];
        for (byte i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (byte) (Math.random() * 90 + 10);
        }
        System.out.println(Arrays.toString(randomNumbers));
        boolean isIncreasing = true;
        for (byte i = 1; i < randomNumbers.length; i++) {
            if(randomNumbers[i] <= randomNumbers[i - 1]) {
                isIncreasing = false;
                break;
            }
        }
        System.out.println("The array is an increasing sequence -'" + isIncreasing + "'");
    }
}
