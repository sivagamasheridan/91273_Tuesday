
package cardgame;

/**
 *
 * @author Shashank
 */
public class CardTrick {
     public static void main(String[] args)
     {
       CardGame[] magicHand = new CardGame[7]; // aArray of objects
       for(int i=0; i<magicHand.length; i++)
       {
         CardGame c1 = new CardGame(); // an object
         c1.setValue(c1.ranValue()); // random number from 1 to 13
         c1.setSuit(CardGame.SUITS[c1.ranSuit()]);
         magicHand[i] = c1;
         System.out.println(magicHand[i].getSuit()+ " " + magicHand[i].getValue());
       }
       
     // take input suit and value from user. compare with the array print your card is found
     }    
}
