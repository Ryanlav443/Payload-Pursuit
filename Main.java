public class Main {

    // Main Method, the starting point of the Game
    public static void main(String[] args) {

        System.out.println("--------------------------------------");
        System.out.println("           Payload Pursuit");
        System.out.println("--------------------------------------");

        // Create a new deck
        Deck deck = new Deck();

        // Shuffle the deck
        deck.shuffle();

        System.out.println("\nDrawing 5 cards:\n");

        // Draw 5 cards
        for (int i = 0; i < 5; i++) {
            Card card = deck.drawCard();
            System.out.println(card + " - Value: " + card.getValue());
        }

        // Display remaining cards
        System.out.println("\nCards remaining: " + deck.cardsRemaining());
    }
}
