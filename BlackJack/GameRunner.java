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
        int count = 2;
        for (int i = 0; i < 300; i++) {
            Scanner sc = new Scanner(System.in);
            Deck theDeck = new Deck(1, true);

            Player me = new Player("Mr.Jaffe");
            Player dealer = new Player ("Dealer");

            me.addCard(theDeck.dealNextCard());
            dealer.addCard(theDeck.dealNextCard());
            me.addCard(theDeck.dealNextCard());
            dealer.addCard(theDeck.dealNextCard());

            System.out.println("Cards are dealt\n");
            me.printHand(true);
            System.out.println("Value: " + me.getHandSum());
            System.out.println();
            dealer.printHand(false);
            System.out.println("\n");

            boolean meDone = false;
            boolean dealerDone = false;
            String ans;

            while (!meDone && me.getHandSum() < 21) {
                if (!meDone) {
                    System.out.print("Hit or Stay? (Enter H or S): ");
                    ans = sc.next();
                    System.out.println();

                    if (ans.compareToIgnoreCase("H") == 0) {
                        meDone = !me.addCard(theDeck.dealNextCard());
                        me.printHand(true);
                        System.out.println("Value: " + me.getHandSum());
                        System.out.println();
                        dealer.printHand(false);
                        System.out.println();
                        count++;
                    }
                    else {
                        meDone = true;
                    }
                }
            }
            while (!dealerDone && count > 2) {
                if (!dealerDone) {
                    if (dealer.getHandSum() < 17) {
                        System.out.println("The Dealer hits\n");
                        dealerDone = !dealer.addCard(theDeck.dealNextCard());
                        dealer.printHand(false);
                    } else {
                        System.out.println("The Dealer stays\n");
                        dealerDone = true;
                    }
                }

                System.out.println();
            }

            me.printHand(true);
            System.out.println("Value: " + me.getHandSum());
            dealer.printHand(true);
            System.out.println("Value: " + dealer.getHandSum());

            int mySum = me.getHandSum();
            int dealerSum = dealer.getHandSum();
            
            if (mySum > 21) {
                System.out.println("You Busted. Dealer wins.");
            }
            
            else if (mySum == dealerSum) {
                System.out.println("Draw.");
            }

            else if (mySum < dealerSum && dealerSum < 21 || mySum > 21) {
                System.out.println("Dealer wins!");
            } 
            else if (mySum == 21) {
                System.out.println("BlackJack! You win.");
            }
            else {
                System.out.println("You win!");
            }
            
            System.out.println("New hand? (Enter Y or N):");
            
            ans = sc.next();
            if (ans.compareToIgnoreCase("N") == 0) {
                break;
            }
        }
    }
}
