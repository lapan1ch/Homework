package Homework1.Additional;

public class First {
    public static void main(String[] args){
        InputForFirst inputForFirst = new InputForFirst();
        System.out.println("Enter first number");
        double a = inputForFirst.firstDoubleNumber();
        System.out.println("Enter second number");
        double b = inputForFirst.secondDoubleNumber();
        double add = a + b;
        double sub = a - b;
        double mul = a * b;
        double div = a / b;
        System.out.println("Addition equals \"" + add + "\", subtraction equals \"" + sub +
                "\", multiplication equals \"" + mul + "\" & division equals \"" + div + "\".");
    }
}
