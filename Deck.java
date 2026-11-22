import java.util.Random;

public class Deck {

    // Array to store the 52 cards
    private Card[] cards;

    // Keeps track of the next card to deal
    private int cardsDealt;

    // Constructor
    public Deck() {

        cards = new Card[52];

        String[] suits = {
                "Hearts",
                "Diamonds",
                "Spades",
                "Clubs",
        };

        String[] ranks = {
                "Ace", "2", "3", "4", "5",
                "6", "7", "8", "9",  "10",
                "Jack", "Queen", "King"
        };

        int index = 0;

        // Create all 52 cards
        for (String suit : suits) {
            for (String rank : ranks) {
                cards[index] = new Card(rank, suit);
                index++;
            }
        }
        cardsDealt = 0;
    }

    // Shuffle the deck
    public void shuffle() {
        Random random = new Random();
        for (int i = cards.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;

        }

        // Reset the deck
        cardsDealt = 0;
    }

    // Deal one card
    public Card drawCard() {
        if (cardsDealt >= cards.length) {
            return null;
        }

        Card drawnCard = cards[cardsDealt];
        cardsDealt++;
        return drawnCard;
    }

    // Returns the number of remaining cards
    public int cardsRemaining() {
        return cards.length - cardsDealt;
    }
}
