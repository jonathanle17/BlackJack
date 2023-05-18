
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
    }
    
    public boolean addCard(Card aCard) {
        //print error if max cards (should never)
        if (this.numCards == 10) {
            System.err.printf("%/s's hand already has 10 cards; " +
                    "cannot add another\n", this.name);
            System.exit(1);
        }
        
        //add new card in next slot and increment number of cards counter
        this.hand[this.numCards] = aCard;
        this.numCards++;
        
        return (this.getHandSum() <= 21);
    }
    
    public int getHandSum() {
       int handSum = 0;
       int cardNum;
       int numAces = 0;
       
       //calculate each card's contribution to hand sum
       for (int c = 0; c < this.numCards; c++) {
           cardNum = this.hand[c].getNumber();
           
           if (cardNum == 1) {
               numAces++;
               handSum += 11;
           } else if (cardNum > 10) {
               handSum += 10;
           } else {
               handSum += cardNum;
           }
       }
       
       //if would've busted and has at least one ace, sets it to 1 instead 11
       while (handSum > 21 && numAces > 0) {
           handSum -= 10;
           numAces--;
       }
       
       return handSum;
    }
    
    //print cards in player's hand
    //showfirstCard whether first card is hidden or not
    public void printHand(boolean showfirstCard) {
        System.out.printf("%s's cards:\n", this.name);
        for (int c = 0; c < this.numCards; c++) {
            if (c == 0 && !showfirstCard) {
                System.out.println("  [hidden]");
            } else {
                System.out.printf("  %s\n", this.hand[c].toString());
            }
        }
    }
}
