
/**
 * Write a description of class Card here.
 * An implementation of a card type.
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card
{
    // instance variables - replace the example below with your own
    private Suit mySuit; //One of the four vaild suits for this card.
    private int myNumber; //The number of this card (Ace: 1, Jack-King: 11-13)
    
    public Card(Suit aSuit, int aNumber) {
      this.mySuit = aSuit;
      this.myNumber = aNumber; 
    }
}
