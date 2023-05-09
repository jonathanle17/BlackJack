 
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
    
    public int getNumber() {
        return myNumber;
    }
    
    public String toString() {
        String numStr;
        
        switch(this.myNumber) {
            
        case 2:
            numStr = "Two";
            break;
                
        case 3:
            numStr = "Three";
            break;
            
        case 4:
            numStr = "Four";
            break;
        
        case 5:
            numStr = "Five";
            break;
        
        case 6:
            numStr = "Six";
            break;
        
        case 7:
            numStr = "Seven";
            break;
        
        case 8:
            numStr = "Eight";
            break;
        
        case 9:
            numStr = "Nine";
            break;
            
        case 10:
            numStr = "Ten";
            break;
            
        case 11:
            numStr = "Jack";
            break;
            
        case 12:
            numStr = "Queen";
            break;
            
        case 13:
            numStr = "King";
            break;
            
        case 14:
            numStr = "Ace";
            break;
        }
        
        return numStr + " of " + mySuit
    }
}
