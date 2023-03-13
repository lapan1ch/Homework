package Test2;

public class Calct {

    int first;

    int second;

    int third;
    public boolean isEven;


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


    public int maxOfTwoNumbers(int first, int second) {
        if (first > second) {
            return first;
        } else if (first < second) {
            return second;
        }
        return first; // Или можно написать return second; - если оба числа равны между собой, то вернуть можно любое из них.
    }
    public int maxOfThree(int first, int second, int third) {
        int max = first;
          if (second > max) {
            max = second;
        }  if (third > max) {
            return max;
        } else {
            return third;
        }
    }
}


