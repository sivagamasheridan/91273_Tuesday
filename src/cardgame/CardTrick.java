/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

import java.util.Scanner;

/**
 *
 * @author srinivsi
 */
public class CardTrick {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
      CardGame[] magicHand = new CardGame[7];//array of objects
      for(int i=0;i<magicHand.length;i++)
      {
      CardGame c1 = new CardGame();//object
      c1.setValue(c1.ranValue());//random number 1 to 13
      c1.setSuit(CardGame.SUITS[c1.ranSuit()]);
      magicHand[i] =c1;
      }
//   for(int i=0;i<magicHand.length;i++)
//      {
//      System.out.println(magicHand[i].getSuit() +" "+ magicHand[i].getValue());
//      
//      }
// take input suit and value from user. compare with array.if same card is 
//in the array print your card is found. 
    System.out.println("Enter your card suit");
    String guessSuit = input.nextLine();
    System.out.println("Enter your card number");
    int guessCard = input.nextInt();
    
    
    
    for(int i=0;i<magicHand.length;i++)
      {
          if(guessSuit.equals(magicHand[i].getSuit())){
               if(guessCard == magicHand[i].getValue()) {
               System.out.println("You got a perfect match"); 

               }
          
               else{
               System.out.println("Sorry you did not get a match");
               }
          }
      
      }
      
    }
}
