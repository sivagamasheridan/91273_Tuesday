/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

/**
 *
 *Shashank Ananthoju - 991543348 
  INClass Assignment#1
 */
public class CardGame 
{
private String suit; // spades, diamonds, clubs, hearts
private int value; // values from 1 to 13
public static final String[] SUITS = {"spades", "diamonds", "clubs", "hearts"};

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
    
    // you have to write two methods for random generation of suit and value

    public int ranSuit()
    {
     int value = (int)(Math.random()*3+0);
     return value;
    }

    public int ranValue()
    {
      int value = (int)(Math.random()*13)+1;
      return value;
    }
}
