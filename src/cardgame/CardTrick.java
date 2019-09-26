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
//modified by Priya Singh
public class CardTrick {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the Card you want -");
    String a = scan.nextLine();
            
      CardGame[] magicHand = new CardGame[7];//array of objects
      for(int i=0;i<magicHand.length;i++){
      CardGame c1 = new CardGame();//object
      c1.setValue(c1.ranValue());//random number 1 to 13
      c1.setSuit(CardGame.SUITS[c1.ranSuit()]);
      magicHand[i] =c1;
      }
    for(int i=0;i<magicHand.length;i++)
      {
      String b = magicHand[i].getSuit() +" "+ magicHand[i].getValue();
          System.out.println(b);
      if(a==b){
          System.out.println("Congratulaions !! , Your card is found");
      }
      else {System.out.println("Sorry , Try Again");}
      
      }
// take input suit and value from user. compare with array.if same card is 
//in the array print your card is found. 
    
    }
}
