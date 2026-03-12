public class Game {

    Deck deck;
    Player player[];
    private String ranks[] = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

    Game(String names[]){
        deck = new Deck();
        deck.shuffle();
        player = new Player[names.length];
        for(int i = 0; i < names.length; i++){
            player[i] = new Player(names[i]);
        }
    }

    private int getCardValue(Card card){
        String rank = card.getRank();
        for(int i = 0; i < ranks.length; i++){
            if(ranks[i].equals(rank)){
                return i + 2; 
            }
        }

        return 0;
    }

    public void startGame(int rounds){

        for(int r = 1; r <= rounds; r++){
            System.out.println("\nRound " + r);
            int highestValue = -1;
            for(int i = 0; i < player.length; i++){
                player[i].drawCard(deck);
                Card card = player[i].getCurrentCard();
                System.out.println(player[i].getName() + " drew " + card);
                int value = getCardValue(card);
                if(value > highestValue){
                    highestValue = value;
                }
            }
            for(int i = 0; i < player.length; i++){
                if(getCardValue(player[i].getCurrentCard()) == highestValue){
                    player[i].addPoint();
                }
            }
        }

        showWinner();
    }

    public void showWinner(){
        int highestScore = -1;
        System.out.println("\nFinal Scores:");
        for(int i = 0; i < player.length; i++){
            System.out.println(player[i]);
            if(player[i].getScore() > highestScore){
                highestScore = player[i].getScore();
            }
        }
        System.out.println("\nWinner(s):");
        for(int i = 0; i < player.length; i++){
            if(player[i].getScore() == highestScore){
                System.out.println(player[i].getName());
            }
        }
    }
}