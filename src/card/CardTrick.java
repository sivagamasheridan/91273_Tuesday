
package card;

import java.util.Scanner;

/**
 *
 * @author Ridhima Nanda
 */
public class CardTrick 
{
  public static void main(String[] args)
    {
        Card[] magicHand=new Card[7]; //array of object   
       for(int i=0;i<magicHand.length;i++) 
       {
           
       
       Card c1=new Card(); //object
       c1.setValue(c1.ranValue()); // random number from 1 to 13
       c1.setSuit(Card.SUITS[c1.ranSuit()]);
        magicHand[i]=c1;
        
       }
       
        for(int i=0;i<magicHand.length;i++) 
       {
           
       
       System.out.println(magicHand[i].getSuit()+" "+magicHand[i].getValue());
        
       }
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a card value and suit");
        int cardValue = sc.nextInt();
        sc.nextLine();
        String suitValue = sc.nextLine();
        boolean found = false;
          for(int i = 0;i<magicHand.length;i++)
{
          if(cardValue == magicHand[i].getValue() && 
          suitValue.equalsIgnoreCase(magicHand[i].getSuit()))
{
          found = true;
            break;
}
}

if (found)
{

System.out.println("you got it!");
}
else
{
System.out.println("not got it!");
}
}

}




        
          
    

