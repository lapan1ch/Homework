package homework3;

import java.util.Scanner;

class TwoWordsMerged {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first word with even symbols count");
        String firstWord = scanner.nextLine();
        System.out.println("Enter second word with even symbols count");
        String secondWord = scanner.nextLine();
        if (!firstWord.contains(" ") && !secondWord.contains(" ")
                && firstWord.length() % 2 == 0 && secondWord.length() % 2 == 0) {
            System.out.println("Two words merge into - \"" + firstWord.substring(0,(firstWord.length() / 2))
                    + secondWord.substring(secondWord.length() / 2) + "\"");
        } else {
            System.out.println("Check if your words contain blanks and whether each of them has even symbols count");
        }
    }
}
