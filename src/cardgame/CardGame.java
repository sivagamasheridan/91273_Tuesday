
package cardgame;

/**
 *
 * @author Sargun Josun
 */
public class CardGame 
{
    private String suit; //spades,diamonds,clubs,hearts
    private int value; //1 to 13
    public static final String [] SUITS ={"Clubs","Hearts","Diamonds","Spades"};
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
    // write two methods to generate random value and suit
    
    public int randSuit()
    {
       return (int) (Math.random() * 4);
    }
     public int randValue()
     {
         return (int) (Math.random() * 13 )+ 1; 
     }
}
