/**
 * This is a class that tests the Card and Deck classees.
 */
public class Tester {

	public static void main(String[] args) {
        Card card = new Card("Jack", "Spades", 11);
        Card card1 = new Card("Jack", "Spades", 11);
        System.out.println(card.getRank() + "    " + card.getSuit() + "    " + card.getPointValue() + "    " + card.toString());
        System.out.println(card.equals(card1));
        String[] ranks = {"Ace", "2", "3"};
        String[] suits = {"Clubs", "Hearts"};
        int[] values = {1, 2, 3};
        Deck d1 = new Deck(ranks, suits, values);
        System.out.println(d1);
        
	}
}
