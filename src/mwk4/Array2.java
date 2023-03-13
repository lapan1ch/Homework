package mwk4;


import java.util.Random;

public class Array2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random random = new Random();

        // заполняем массив случайными числами
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(90) + 10;
            System.out.print(arr[i] + " "); // выводим числа на экран в строку
        }

        // проверяем, является ли массив строго возрастающей последовательностью
        boolean isIncreasing = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) { // если текущее число меньше или равно предыдущему
                isIncreasing = false;
                break;
            }
        }

        // выводим сообщение о результате проверки
        if (isIncreasing) {
            System.out.println("\nМассив является строго возрастающей последовательностью");
        } else {
            System.out.println("\nМассив не является строго возрастающей последовательностью");
        }
    }
}

