public class Card {
    private final String SUIT;
    private final String RANK;

    Card(String suit, String rank){
        this.SUIT = suit;
        this.RANK = rank;
    }

    public String getSuit() {
        return SUIT;
    }

    public String getRank() {
        return RANK;
    }
    public String toString(){
        return String.format("%s of %s", RANK, SUIT);
    }
}