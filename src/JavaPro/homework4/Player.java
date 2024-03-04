package JavaPro.homework4;

public class Player {

    private final Card[] hand;

    public Player() {
        hand = new Card[5]; // Each player has 5 cards
    }

    public void addCardToHand(Card card, int index) {
        hand[index] = card;
    }

    public void showHand() {
        for (Card card : hand) {
            System.out.println(card);
        }
        System.out.println();
    }
}
