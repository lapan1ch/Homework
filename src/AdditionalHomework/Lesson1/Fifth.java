package AdditionalHomework.Lesson1;

public class Fifth {
    public static void main(String[] args) {
        InputForAllTasks input = new InputForAllTasks();
        System.out.println("Enter first integer number");
        short a = input.aShortNumber();
        System.out.println("Enter second integer number");
        short b = input.aShortNumber();
        System.out.println("Enter third integer number");
        short c = input.aShortNumber();
        float average = (a + b + c) / 3f;
        System.out.println("Average is " + average);
    }
}
