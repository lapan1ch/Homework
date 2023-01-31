package AdditionalHomework.Lesson3;

import java.util.Scanner;

public class WorkWithString {
    public static void main(String[] args) {
        String myName = "Vitalii";
        System.out.println(myName);
        System.out.println("Hi " + myName + "!");
        System.out.println("Could you enter user's name?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Hi " + userName + "!");
    }
}
