
package card;

/**
 *
 * @author Ridhima Nanda
 */
public class Card {

    
     private String suit; //spades,diamonds,clubs,hearts
    private int value; //1 to 13
    public static final String[] SUITS={"clubs","spades","diamonds","hearts"};

    
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
        int value= (int)(Math.random()*4)+0;
        return value;
        
    }
    public int ranValue()
    {
     
        int value= (int)(Math.random()*13)+1;
        return value;
    }
    
    
    
    
}
