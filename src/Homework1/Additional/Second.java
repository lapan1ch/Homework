package Homework1.Additional;
public class Second {
    public static void main(String[] args) {
        InputForAllTasks inputForAllTasks = new InputForAllTasks();
        System.out.println("Enter your full name");
        String fullName = inputForAllTasks.aText();
        System.out.println("Hello, " + fullName + "!");
    }
}
