package homework4;

public class TillNArrayLength {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5};
        int n = 5;
        int sum = (n * (n + 1)) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        System.out.println(sum - actualSum);
    }
}
//В Java, длина массива и его индексы должны быть заданы типом int, так как это ограничение заложено в спецификации
//Java. Тип int является типом, который может представлять значения в диапазоне от -2^31 до 2^31-1, а массивы в Java
//ограничены размером в 2^31-1 элементов.