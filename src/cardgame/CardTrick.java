/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. change
 */
package cardgame;

/**
 *
 * @author srinivsi
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
    
    
    }
}
