public class Player{
    String name;
    int score;
    Card currentCard; 

    Player(String name) {
        this.name = name;
        this.score = 0;
        this.currentCard = null;
    }
    public void drawCard(Deck deck){
        currentCard = deck.drawCard();
    }
    public String getName() {
        return name;
    }
    
    public int getScore() {
        return score;
    }
    
    public Card getCurrentCard() {
        return currentCard;
    }
    
    public void setCurrentCard(Card card) {
        this.currentCard = card;
    }
    
    public void addPoint() {
        score++;
    }

    public String toString() {
        return String.format("%s (Score: %d)", name, score);
    }
}