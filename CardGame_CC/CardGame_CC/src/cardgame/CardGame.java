
package cardgame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Megha Patel
 */
public class CardGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Directions d=Directions.SOUTH;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of cards in a hand: ");
        int num=input.nextInt();
        //an array of card to hold mentioned cards
        Card[] hand=CardHandGenerator.generateHand(num);
        
        //print the hand
        System.out.println("Cards in hand: ");
        for(Card card:hand)
        {
            System.out.println( card.getValue()+" of "+ card.getSuit());
        }
        
        //2)ask user to pick a card for match
        
        System.out.println("Pick a card for match:");
        System.out.println("Pick a suit for your card: ");
//        String s=input.nextLine();
        for(int i=0; i<Card.Suit.values().length;i++)
        {
            System.out.println((i+1)+": "+Card.Suit.values()[i]);
        }
        
        int suitPos=input.nextInt()-1;
        
        System.out.println("Enter value from 1 to 13: ");
        for(int i=0;i<Card.Value.values().length;i++)
        {
           System.out.println((i+1)+": "+Card.Value.values()[i]);
        
        }
        int valPos=input.nextInt()-1;
       // Card userPick=new Card(value,s);
        
        Card userPick=new Card(Card.Value.values()[valPos],Card.Suit.values()[suitPos]);
        
        //check for usercard match
        MatchCard.cardMatch(userPick, hand);
        
        
        
        
        
        
    }
    

}
