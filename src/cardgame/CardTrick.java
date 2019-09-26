/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

import java.util.Scanner;

/**
 *
 * @author Thuan Nguyen
 */
public class CardTrick {
    public static void main(String[] args) 
    {
      
      boolean rightCard = false;  
      
      
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
        
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter your Suit:");
      String type = input.nextLine();
      System.out.println("Please enter your Value:");
      int number = input.nextInt();  

       for (int i = 0; i < magicHand.length; i++){
            if (type.equalsIgnoreCase(magicHand[i].getSuit()) && (number == (magicHand[i].getValue()))){
                System.out.println("Your card matches the result.");
                rightCard = true;
            }
        }
        
        if (rightCard == false){
            System.out.println("Your card does not match the result.");
        }
    }
}
       
        


    

