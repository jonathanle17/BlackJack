import java.util.Random;
/**
 * Write a description of class Deck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Deck
{
    // instance variables - replace the example below with your own
    private Card[] myCards; //array of cards in deck, where top card is first index
    
    private int numCards; // number of cards currently in deck
    
    public Deck(int numDeck, boolean shuffle) {
         this.numCards = numDecks * 52;
         this.myCards = new Card[this.numCards];
         
         int c = 0; //card index
         
         for (int d = 0; d < numDecks; d++) { //for each deck
             for (int s = 0; s < 4; s++) { // for each suit
                 for (int n = 1; n <= 13; n++) { // for each number 
                    //add new card 
                    this.myCards[c] = new Card(Suit.values()[s], n);
                 }
             }
         }
    }
}
