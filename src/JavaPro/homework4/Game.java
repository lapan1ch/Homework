package JavaPro.homework4;

import java.util.Scanner;

public class Game {

    public void play() {
        final int cardsForPlayer = 5;
        int players;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the number of players: ");

            if (scanner.hasNextInt()) {
                players = scanner.nextInt();
                if (players > 0) {
                    break;
                } else if (players == 0) {
                    System.out.println("The game has been terminated.");
                    return;
                } else {
                    System.out.println("The number of players cannot be less than 0");
                }
            } else {
                System.out.println("You have not entered a valid number!");
                scanner.next(); // consume invalid input
            }
        }

        Deck deck = new Deck();
        deck.shuffle();

        Player[] playersArray = new Player[players];
        for (int i = 0; i < players; i++) {
            playersArray[i] = new Player();
        }

        for (int i = 0; i < cardsForPlayer; i++) {
            for (Player player : playersArray) {
                player.addCardToHand(deck.dealCard(), i);
            }
        }

        for (Player player : playersArray) {
            player.showHand();
        }
    }
}
