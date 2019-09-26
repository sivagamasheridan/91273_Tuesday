/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

/**
 *
 * @author srinivsi
 * @CONTRIBUTOR Kevin_Dado 991550941
 */
import java.util.Scanner;
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
    Scanner in = new Scanner(System.in); //input stream
    //user inputs
    int suitNumber, user_card_number;
    String user_suit;
    
    //taking user input
    System.out.println("Enter suit type: 0 for clubs, 1 for hearts, 2 for "
            + "diamonds, 3 for spades");
    suitNumber = in.nextInt();
    System.out.println("Enter card number from 1 to 13");
    user_card_number = in.nextInt();
    
    //invalid card choice
    if((suitNumber<0 || suitNumber>3) || (user_card_number<1 || user_card_number
            >13)) {
        System.out.println("Invalid Inputs");
    }else {
        
        //get the suit type in string
        user_suit = CardGame.SUITS[suitNumber];
        
        int i;
        //loop for all the cards in magicHand
        for(i=0;i<magicHand.length;i++)
        {
            //Match found, if both attributes are equal
            if(user_suit.equals(magicHand[i].getSuit())&& user_card_number == 
                    magicHand[i].getValue()){
                System.out.println("Your card is found");
                break;
            }
        }
        //reached at the end of loop but no match found
        if(i==magicHand.length){
            System.out.println("Your card is not found");
        }
    }
    
    }
}
