/*
 * Jerome Brown
 *  sivagamasheridan/ICE1_91273_Tuesday
 * October 1st 2019
 */
package cardgame;

import java.util.Scanner;

/**
 *
 * @author Jerome Brown
 */
public class CardTrick {
   
    
    
    
    public static void main(String[] args) 
    {
      
      //Get input From User 
       
       Scanner input = new Scanner(System.in);
       
       System.out.print("PICK A CARD ANY CARD!!!!!!");
      
       //Enter Card Value
       System.out.print("Enter Value of Card: ");
       int valueIn = input.nextInt(); // taking value input from user 
       
       //Enter Suit
       System.out.print("Enter Suit of Card: ");
       String suitIn = input.next(); //taking suit from user
        
      CardGame[] magicHand = new CardGame[7];//array of objects
      for(int i=0;i<magicHand.length;i++)
      {
      CardGame c1 = new CardGame();//object
      c1.setValue(c1.ranValue());//random number 1 to 13
      c1.setSuit(CardGame.SUITS[c1.ranSuit()]);
      magicHand[i] =c1;
      }
         

       //Loop and print cards while checking for match
       
         for (int j=0; j<magicHand.length; j++)
        {System.out.println(magicHand[j].getValue() + " OF " + magicHand[j].getSuit());
       
        
    
         if (valueIn == magicHand[j].getValue() && suitIn.equals(magicHand[j].getSuit()))
         { 
             System.out.println("You've got a Match");
         
         }
         
         else if  (valueIn != magicHand[j].getValue())
         { 
             System.out.println("No Match");
         
         }
        
    }
}
}
