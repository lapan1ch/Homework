package JavaPro.homework4;

import java.util.Random;

public class Deck {

     private final Card[] cards;
     private int currrentCardIndex;
     private int currentCardIndex;

     public Deck() {
          cards = new Card[Suit.values().length * Rank.values().length];
          int currentCardIndex = 0;
          int index = 0;
          for (Rank rank : Rank.values()) {
               for (Suit suit : Suit.values()) {
                    cards[index++] = new Card(suit, rank);
               }
          }
     }

     public void shuffle(){
          Random random = new Random();
          for (int i = 0; i < cards.length; i++) {
               int randomIndex = i + random.nextInt(cards.length - i);
               Card temp = cards[randomIndex];
               cards[randomIndex] = cards[i];
               cards[i] = temp;
          }
           currentCardIndex = 0;
     }
     public Card dealCard() {

          if (currentCardIndex < cards.length) {
               return cards[currentCardIndex++];
          } else {
               return null; // deck is empty
          }
     }
}

