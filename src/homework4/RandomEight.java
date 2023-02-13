package homework4;

import java.util.Arrays;

class RandomEight {
    public static void main(String[] args) {
        byte[] randomNumbers = new byte[8];
        for (byte i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (byte) (Math.random() * 50 + 1);
        }
        System.out.println(Arrays.toString(randomNumbers));
        for (byte i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] % 2 != 0) {
                randomNumbers[i] = 0;
            }
        }
        System.out.println(Arrays.toString(randomNumbers));
    }
}
//"randomNumbers[i] = (int) (Math.random() * 50 + 1);" это код, где каждый элемент массива randomNumbers[i]
// присваивается случайное целое число из диапазона [1, 50].
//
//Вызывается метод Math.random(). Он возвращает псевдослучайное десятичное число в интервале [0, 1).
//Десятичное число умножается на 50, чтобы получить число в диапазоне [0, 50).
//К результату прибавляется 1, чтобы получить число в диапазоне [1, 50].
//Результат приводится к типу int с помощью конструкции (int), так как Math.random() возвращает значение типа double.
//Полученное целое число присваивается элементу массива randomNumbers[i].