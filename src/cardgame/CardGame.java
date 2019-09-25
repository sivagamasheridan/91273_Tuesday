/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

/**
 *
 * @author Nima
 */
public class CardGame {

    /**
     * @param args the command line arguments
     */
    private String suit;//taking the value of spade,diamondss,clubs,hearts
    private int value;//value from 1 to 13
    public static final String[] SUITS={"clubs","hearts","spades","diamonds"};

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
    //you have to write two methods for random generator.
    public int ranSuit()
    {
            int value = (int)(Math.random()*4) + 0;
            return value;
    }
    public int ranValue()
    {
        int value = (int)(Math.random()*13) + 1;
        return value;
    }
}
