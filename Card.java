public class Card {

    // Instance variables
    private String rank;
    private String suit;

    // Constructor
    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // Returns the card rank
    public String getRank() {
        return rank;
    }

    // Returns the card suit
    public String getSuit() {
        return suit;
    }

    // Calculates the card value
    public int getValue() {

        // Number cards
        if (rank.equals("Ace")) {
            return 11;
        }

        if (rank.equals("Jack") ||
            rank.equals("Queen") ||
            rank.equals("King")) {

            return 10;
        }

        // Convert number card rank into an integer
        return Integer.parseInt(rank);
    }

    // Displays the card
    public String toString() {
        return rank + " of " + suit;
    }
}
