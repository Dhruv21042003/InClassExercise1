package exercise1;

import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Dhruv
 * @author Dhruv Patel Jan 25, 2023 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue((int) (1 + Math.random() * 13));
            card.setSuit(Card.SUITS[(int)(0 + Math.random() * 3)]);
            hand[i] = card;
            System.out.println(hand[i].getSuit() + " " + hand[i].getValue());
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Suit: ");
        String usersuit = input.nextLine();
        System.out.print("Enter Card Value: ");
        int uservalue = input.nextInt();
        
        for(int i=0; i<hand.length; i++)
        {
            if(usersuit.equalsIgnoreCase(hand[i].getSuit()) && uservalue==hand[i].getValue())
            {
                printInfo();
                break;
            }
        }
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Dhruv Patel Jan 25, 2022
     */
    // I AM DONE!
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Dhruv Pate, but you can call me Dhruv, D or Bro");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Start many Manufacturing and IT Companies.");
        System.out.println("-- Start a Tourism Industry on a private Island.");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Learning new things about Space.");
        System.out.println("-- Beatboxing");
        System.out.println("-- Watching Anime");
        System.out.println("-- Listuning to Music");

        System.out.println();
        
    
    }

}
