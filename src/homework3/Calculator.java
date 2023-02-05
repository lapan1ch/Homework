package homework3;

import java.util.Scanner;

class Calculator {
    private float firstNumber;
    private float secondNumber;
    public void inputNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        firstNumber = scanner.nextFloat();
        System.out.println("Enter second number");
        secondNumber = scanner.nextFloat();
    }
    float plus(){
        return firstNumber + secondNumber;
    }
    float minus(){
        return firstNumber - secondNumber;
    }
    float times(){
        return firstNumber * secondNumber;
    }
    float divide(){
        return firstNumber / secondNumber;
    }
}
