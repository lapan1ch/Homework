package Test;

import java.util.Scanner;

public class WorkStr {
    public static void main(String[] args) {

        String myName = "Sasha";
        System.out.println(myName);
        System.out.println("Hi " + myName + "!");
        System.out.println("Enter UserName - ");
        Scanner scanner = new Scanner(System.in);
        String userName =scanner.nextLine();
        System.out.println("Hi  " + userName + "!");
    }
}
