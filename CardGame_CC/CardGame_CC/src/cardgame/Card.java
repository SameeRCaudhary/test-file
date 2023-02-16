package cardgame;

public class Card {

	public enum Suit{
            HEARTS, CLUBS, DIAMONDS, SPADES
        }
        public enum Value{
         ACE, TWO, THREE,FOUR,FIVE,SIX,SEVE,EIGHT,NINE,TEN,JACK,QUEEN,KING
        
        }
       
        private Value value;
        private Suit suit;

        public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }
        
        //an array of possible suits
//        public static final String[] SUITS={"Hearts","Diamonds","Spades","Clubs"};

    /**
     * @return the value
     */
    public Value getValue() {
        return value;
    }

    
    /**
     * @return the suit
     */
    public Suit getSuit() {
        return suit;
    }

}