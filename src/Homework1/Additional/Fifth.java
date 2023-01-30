package Homework1.Additional;
public class Fifth {
    public static void main(String[] args) {
        InputForAllTasks inputForAllTasks = new InputForAllTasks();
        System.out.println("Enter first integer number");
        short a = inputForAllTasks.aShortNumber();
        System.out.println("Enter second integer number");
        short b = inputForAllTasks.aShortNumber();
        System.out.println("Enter third integer number");
        short c = inputForAllTasks.aShortNumber();
        float average = (a + b + c) / 3f;
        System.out.println("Average is " + average);
    }
}
