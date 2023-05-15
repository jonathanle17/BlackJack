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
    
    public Deck() { 
        //call the other constructor, defining one deck without shuffling
        this(1, false);  
    }
    
    public Deck(int numDecks, boolean shuffle) {
         this.numCards = numDecks * 52;
         this.myCards = new Card[this.numCards];
         
         int c = 0; //card index
         
         for (int d = 0; d < numDecks; d++) { //for each deck
             for (int s = 0; s < 4; s++) { // for each suit
                 for (int n = 1; n <= 13; n++) { // for each number 
                    //add new card 
                    this.myCards[c] = new Card(Suit.values()[s], n);
                    c++;
                 }
             }
         }
         
         if (shuffle) { //shuffle
             this.shuffle();
         }
    }
    
    public void shuffle() {
        //init random number generator 
        Random rng = new Random();
        
        //temp card
        Card temp;
        
        int j;
        for (int i = 0; i < this.numCards; i++) {
            //get a random card j to swap i's value with
            j = rng.nextInt(this.numCards);
            
            //do swap
            temp = this.myCards[i];
            this.myCards[i] = this.myCards[j];
            this.myCards[j] = temp;
        }
    }
    
    public Card dealNextCard() {
        //get top card
        Card top = this.myCards[0];
        
        //shift all cards to left by one index
        for (int c = 1; c < this.numCards; c++) {
            this.myCards[c-1] = this.myCards[c];
        }
        this.myCards[this.numCards-1] = null;
        
        //decrement the number of cards in our deck
        this.numCards--;
        
        return top;
    }
    
    //Print the top cards in the deck
    //numToPrint - the number of cards from the top of the deck to print
    public void printDeck(int numToPrint) {
        for (int c = 0; c < numToPrint; c++) {
            System.out.printf("% 3d/%d %s\n", c+1, this.numCards,
                    this.myCards[c].toString()); //review
        }
        System.out.printf("\t[%d others]\n", this.numCards-numToPrint); 
        //review
    }
}
