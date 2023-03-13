package mwk4;

public class Array3  {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5};
        int[] arr2 = {6, 1, 2, 8, 3, 4, 7, 10, 5};

        int n1 = 5;
        int n2 = 10;

        int sum1 = (n1 * (n1 + 1)) / 2; // сумма всех чисел от 1 до N
        int sum2 = (n2 * (n2 + 1)) / 2;

        // вычисляем сумму чисел в массиве arr1
        int arrSum1 = 0;
        for (int i = 0; i < arr1.length; i++) {
            arrSum1 += arr1[i];
        }

        // вычисляем сумму чисел в массиве arr2
        int arrSum2 = 0;
        for (int i = 0; i < arr2.length; i++) {
            arrSum2 += arr2[i];
        }

        int missingNum1 = sum1 - arrSum1; // находим недостающий элемент в массиве arr1
        int missingNum2 = sum2 - arrSum2; // находим недостающий элемент в массиве arr2

        System.out.println("Для массива arr1 недостающий элемент: " + missingNum1);
        System.out.println("Для массива arr2 недостающий элемент: " + missingNum2);
    }
}
