package ca.sheridancollege.week3.softwarefundamentals.ice1;
/**
 *
 * @author sheogorath98
 */

public class Card {

   private String suit;
   private int value;

   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};

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
    
   public int ranSuit()
   {
    int value= (int)(Math.random()*4+0);
    return value;
}
public int ranValue()
{
 int value= (int)(Math.random()*13+1);   
 return value;
}
    
}
