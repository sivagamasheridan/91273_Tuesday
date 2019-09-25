package cardgame;
/**
 *
 * @author Sargun Josun
 */
public class CardTrick 
{
    public static void main(String[]args)
    {
        CardGame[] magicHand = new CardGame[7];
        for(int i=0;i< magicHand.length;i++)
        {
            CardGame c = new CardGame();
            c.setValue(c.randValue());
            c.setSuit(CardGame.SUITS[c.randSuit()]);
            magicHand[i] = c;
        }
        for(int i=0;i<magicHand.length;i++)
        {
            System.out.println("Card "+(i+1)+" is "+magicHand[i].getValue()+" of "+magicHand[i].getSuit());
        }
    }
    
}
