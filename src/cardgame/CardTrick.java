/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *@ Nimaben Patel
 * Student No.:991542520
 */
package cardgame;

import java.util.Scanner;

/**
 *
 * @author Nima
 */
public class CardTrick {
    public static void main(String[] args) 
    {
        System.out.println("Pick a suit and Enter a Card?");
        Scanner in = new Scanner(System.in);
         String card1 = in.nextLine();
         int card = in.nextInt();
        in.nextLine();
        // TODO code application logic here
        CardGame[] magicHand = new CardGame[7];//array of object
        
        for(int i= 0; i<magicHand.length; i++){
            
            CardGame c1 = new CardGame();//an object
            CardGame luckycard = new CardGame();
            
            c1.setValue(c1.ranValue());//random number from 1 to 13
            c1.setSuit(CardGame.SUITS[c1.ranSuit()]);
            
            magicHand[i] = c1;
            System.out.println(magicHand[i].getSuit()+ " "+ 
                    magicHand[i].getValue());
            
            System.out.println(luckycard.getValue() + " " + luckycard.getSuit());
        }
        
        //take input suit and value from user. compare within the array print
        //your card is found.
        for(int a=0; a<magicHand.length; a++)
        {
            if((magicHand[a].getSuit() == card1)&&(magicHand[a].getValue() == card)) 
                System.out.println("Card is present");
            else
                System.out.println("Card is not present");
       
                break;
        }
        

    }
}
