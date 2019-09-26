/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;
import java.util.Scanner;
/*
 * @author srinivsi
 * 
 */

/*
 * Modified by Richard Mohorovich
 * Date: Wed. Sept. 25th, 2019.
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
      /*
        for(int i=0;i<magicHand.length;i++)
        {
            System.out.println(magicHand[i].getSuit() +" "+ magicHand[i].getValue());
        }
      */

      // Creating user card
      CardGame luckyCard = new CardGame();
      
    // Getting card details to make user card object
    System.out.println("Hello, please enter any card.\n");

    // Inputting luckyCard suit
    System.out.print("Suit: ");
    Scanner input = new Scanner(System.in);
    luckyCard.setSuit(input.nextLine());

    // Inputting luckyCard value
    System.out.print("Value: ");
    luckyCard.setValue(input.nextInt());
        
    //Print test for luckCard
    System.out.println("\nLucky card suit: " +
            luckyCard.getSuit() + " value: " +
            luckyCard.getValue());
    
    }
}
