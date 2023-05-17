import java.util.Scanner;
/**
 * Write a description of class GameRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameRunner
{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Deck theDeck = new Deck(1, true);
       
       Player me = new Player("Mr.Jaffe");
       Player dealer = new Player ("Dealer");
       
       me.addCard(theDeck.dealNextCard());
       dealer.addCard(theDeck.dealNextCard());
    }
}
