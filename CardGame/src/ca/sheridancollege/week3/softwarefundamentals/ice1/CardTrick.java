package ca.sheridancollege.week3.softwarefundamentals.ice1;
/**
 *
 * @author sheogorath98
 */

import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();

 c.setValue(c.ranValue());//random number 1 to 13
      c.setSuit(Card.SUITS[c.ranSuit()]);
      magicHand[i] =c;
      }
    for(int i=0;i<magicHand.length;i++)
      {
      System.out.println(magicHand[i].getSuit() +" "+ magicHand[i].getValue());
      
      }
// take input suit and value from user. compare with array.if same card is 
//in the array print your card is found.
        
        boolean cardNotFound = false;
        Scanner dataIn = new Scanner(System.in);
        
        System.out.println("Please enter a suit: ");
        String card = dataIn.nextLine();
        System.out.println("Please enter a card value: ");
        int cardNum = dataIn.nextInt();
        
        for(int i = 0; i < magicHand.length; i++)
        {
            if(card.equalsIgnoreCase(magicHand[i].getSuit()) && cardNum == magicHand[i].getValue())
            {
                System.out.println("Your matching card found");
                cardNotFound = false;
                break;
    
            }//ends if
            
            if(!(card.equalsIgnoreCase(magicHand[magicHand.length - 1].getSuit()) && cardNum == magicHand[magicHand.length - 1].getValue()))
            {
                cardNotFound = true;
            }//ends else
        }//ends for loop
        
        if(cardNotFound)
        {
            System.out.println("Your matching card is not found");
        }//ends if
    
    }
}
