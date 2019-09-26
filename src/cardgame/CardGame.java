/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

/**
 *
 * @author Rmoho
 */
public class CardGame {

    private String suit; // spades, diamonds, clubs, hearts

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    private int value; // 1 - 13
    public static final String [] SUITS ={"clubs", "hearts", "diamonds", "spades"};
    
    public int ranSuit()
    {
        int value = (int)(Math.random() * 4) + 1;
        return value; // is this right?
    }
    
    public int ranValue()
    {
        int value = (int)(Math.random() * 13) + 1;
        return value;
    }
    /*
    
    /**
     * @param args the command line arguments
     */
    
    /*
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    */
    
}
