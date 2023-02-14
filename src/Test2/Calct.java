package Test2;

public class Calct {

    int first;

    int second;

    public boolean isEven;

    public int maxOfTwoNumbers;


    int sum(int first, int second) {
        return first + second;
    }

    int sub(int first, int second) {
        return first - second;
    }


    int multi(int first, int second) {
        return first * second;
    }

    int div(int first, int second) {
        return first / second;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }


    public int compare(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        }else  {
            return secondNumber;
        }
    }
}