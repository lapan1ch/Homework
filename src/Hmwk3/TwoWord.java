package Hmwk3;

import java.util.Scanner;

public class TwoWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first word - ");
        String str1 = scanner.nextLine();
        System.out.println("Please enter second word - ");
        String str2 = scanner.nextLine();
        System.out.println("Length  first word  - " + str1.length());
        System.out.println("Length second word  - " + str2.length());
        System.out.println("Two substring together - " + str1.substring(0,(str1.length()/2)) + str2.substring(str2.length()/2));
    }
}
