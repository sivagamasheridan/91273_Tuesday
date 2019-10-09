
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

//test
public class CardTrick {
    
    public static void main(String[] args)
    {
     Scanner input = new Scanner(System.in);
       
      
       
      
        
      Card[] magicHand = new Card[7];//array of objects
      for(int i=0;i<magicHand.length;i++)
      {
      Card c1 = new Card();//object
      c1.setValue(c1.ranValue());//random number 1 to 13
      c1.setSuit(Card.SUITS[c1.ranSuit()]);
      magicHand[i] =c1;
      }
       
         for (int p=0; p<magicHand.length; p++)
        {
            System.out.println(magicHand[p].getValue() + " OF " + magicHand[p].getSuit());
       
         System.out.print("Enter Suit of of the Card: ");
       String suits = input.next();
       
       System.out.print("Enter the number of the Card: ");
       int numbers = input.nextInt(); 
    
         if (numbers == magicHand[p].getValue() && suits.equals(magicHand[p].getSuit()))
         { 
             System.out.println("There is that Card");
         
         }
         
         else if  (numbers != magicHand[p].getValue() && suits.equals(magicHand[p].getSuit()))
         { 
             System.out.println("There is no such Card");
         
         
    
}
        }
    }
}
