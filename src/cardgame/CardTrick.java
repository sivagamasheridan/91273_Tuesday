/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

/**
 *
 * @author Pallavi Sharma
 */
import java.util.Scanner;
public class CardTrick {
    public static void main(String[] args) 
    {
        CardGame[] magicHand = new CardGame[7]; //array of object
        for(int i=0;i<magicHand.length;i++)
        {
        CardGame c1=new CardGame(); //object
        c1.setValue(c1.ranValue());
        c1.setSuit(CardGame.SUITS[c1.ranSuit()]);
        magicHand[i]=c1;
        }
        System.out.println("Enter the card suit and the value");
        Scanner sc=new Scanner(System.in);
        String suit=sc.next();
        int value=sc.nextInt();
        int win=0;
        
        
        for(int i=0;i<magicHand.length;i++)
        {
            
            if(suit.equalsIgnoreCase(magicHand[i].getSuit())&&(value==(magicHand[i].getValue())))
            
            {
                win++;
            }
           
                
        }
        if(win>0)
        {
            System.out.println("The cards matched");
        }
        else
        {
            System.out.println("The cards didn't match.They were:");
            for(int i=0;i<magicHand.length;i++)
            {
                System.out.println((magicHand[i].getValue())+" of "+(magicHand[i].getSuit()));
            }
        }
    }
    //take input suit and value from user.compare with array.if same card is 
    //already generated, print your card is found.
       
        
    }
    

