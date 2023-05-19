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

            while (!meDone || !dealerDone) {
                if (!meDone) {
                    System.out.print("Hit or Stay? (Enter H or S): ");
                    ans = sc.next();
                    System.out.println();

                    if (ans.compareToIgnoreCase("H") == 0) {
                        meDone = !me.addCard(theDeck.dealNextCard());
                        me.printHand(true);
                        System.out.println("Value: " + me.getHandSum());
                    }
                    else {
                        meDone = true;
                    }
                }

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

            if (mySum > dealerSum && mySum <= 21 || dealerSum > 21) {
                System.out.println("You win!");
            } else {
                System.out.println("Dealer wins!");
            }
            
            System.out.println("New Hand? (Enter Y or N): ");
            
            ans = sc.next();
            if (ans.compareToIgnoreCase("N") == 0) {
                break;
            }
        }
    }
}
