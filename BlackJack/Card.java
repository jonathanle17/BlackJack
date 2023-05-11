 
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
      
      if (aNumber >= 1 && aNumber <= 13) {
          this.myNumber = aNumber;
      } else {
          System.arr.println(aNumber + "is not a valid Card number");
          System.exit(1);
      }
      
      this.myNumber = aNumber; 
    }
    
    public int getNumber() {
        return myNumber;
    }
    
    public String toString() {
        String numStr = "Error";
        
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
            
        case 1:
            numStr = "Ace";
            break;
        }
        
        return numStr + " of " + mySuit.toString();
    }
}
