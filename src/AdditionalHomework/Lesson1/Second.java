package AdditionalHomework.Lesson1;

public class Second {
    public static void main(String[] args) {
        InputForAllTasks input = new InputForAllTasks();
        System.out.println("Enter your full name");
        String fullName = input.aText();
        System.out.println("Hello, " + fullName + "!");
    }
}