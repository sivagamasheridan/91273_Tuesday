package cardgame;
/**
 *
 * @author Sargun Josun
 */
import java.util.Scanner;
public class CardTrick 
{
    public static void main(String[]args)
    {
        int flag=0;
        Scanner sc = new Scanner(System.in);
        CardGame[] magicHand = new CardGame[7];
        for(int i=0;i< magicHand.length;i++)
        {
            CardGame c = new CardGame();
            c.setValue(c.randValue());
            c.setSuit(CardGame.SUITS[c.randSuit()]);
            magicHand[i] = c;
        }
        
        
        System.out.print("Enter the card's suit: ");
        String suit = sc.next();
        System.out.print("Enter the card value(1-13): ");
        int value = sc.nextInt();
        
        for (CardGame magicHand1 : magicHand) 
        {
            if (suit.equals(magicHand1.getSuit()) && value == magicHand1.getValue())
            {
               flag =1;
            }
        }
        if(flag ==1)
        {
            System.out.println("Your card is in the magic hand of random cards!!!");
        }
        else
        {
            System.out.println("Sorry,your card is not in the magic hand of random cards!!!");
        }
        
        System.out.println("The randomly generated cards were:");
        for(int i=0;i<magicHand.length;i++)
        {
            System.out.println("Card "+(i+1)+" is "+magicHand[i].getValue()+" of "+magicHand[i].getSuit());
        }
    }
    
}
