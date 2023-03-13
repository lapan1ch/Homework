package mwk4;

import java.util.Arrays;
import java.util.Random;

public class Array1 {


        public static void main(String[] args) {
            int[] arr = new int[8];
            Random random = new Random();

            // заполняем массив случайными числами
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(50) + 1;
            }

            // выводим исходный массив на экран
            System.out.println("Исходный массив: " + Arrays.toString(arr));

            // заменяем каждый элемент с нечетным индексом на 0
            for (int i = 1; i < arr.length; i += 2) {
                arr[i] = 0;
            }

            // выводим измененный массив на экран
            System.out.println("Измененный массив: " + Arrays.toString(arr));
        }
    }


