/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;
import java.util.Scanner;

/**
 * Tue,Oct 1st 2019
 * @author fakih
 */
public class CardTrick {
    public static void main(String[] args) 
    {
      CardGame[] magicHand = new CardGame[7];//array of objects
      for(int i=0;i<magicHand.length;i++)
      {
      CardGame c1 = new CardGame();//object
      c1.setValue(c1.ranValue());//random number 1 to 13
      c1.setSuit(CardGame.SUITS[c1.ranSuit()]);
      magicHand[i] =c1;
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
        
        for(int j = 0; j < magicHand.length; j++)
        {
            if(card.equalsIgnoreCase(magicHand[j].getSuit()) && cardNum == magicHand[j].getValue())
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
