
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    private String name;
    
    private Card[] hand = new Card[10]; //cards in player's current hand
    
    private int numCards; //number of cards in player's current hand
    
    public Player(String aName) {
        this.name = aName;
        
        this.emptyHand(); //set a player's hand to empty
    }
    
    public void emptyHand() {
        for (int c = 0; c < 10; c++) {
            this.hand[c] = null;
        }
        this.emptyHand();
    }
    
    public boolean addCard(Card aCard) {
        
    }
}
