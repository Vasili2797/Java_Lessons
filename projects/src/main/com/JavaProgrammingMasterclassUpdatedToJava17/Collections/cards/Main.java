package main.com.JavaProgrammingMasterclassUpdatedToJava17.Collections.cards;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Card[] cardArray =new Card[13];
        Card aceOfHearts = Card.getFaceCard(Card.Suit.HEART, 'A');
        Arrays.fill(cardArray,aceOfHearts);
        Card.printDeck(Arrays.asList(cardArray), "Aces of Hearts",1);

        List<Card> cards = new ArrayList<>(52);
        Collections.fill(cards,aceOfHearts);
        System.out.println(cards);
        System.out.println("cards.size(): "+cards.size());

        List<Card> acesOfHearts = Collections.nCopies(13,aceOfHearts);
        Card.printDeck(acesOfHearts,"Aces of Hearts", 1);

        Card KingOfClubs = Card.getFaceCard(Card.Suit.CLUB,'K');
        List<Card> KingsOfClubs = Collections.nCopies(13,KingOfClubs);
        Card.printDeck(KingsOfClubs,"King of Clubs",1);

        Collections.addAll(cards,cardArray);
        Card.printDeck(cards,"Card Collection with Aces Added", 1);

        Collections.copy(cards,KingsOfClubs);
        Card.printDeck(cards,"Card Collection with Kings copied",1);

        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);

        Collections.shuffle(deck);
        Card.printDeck(deck,"Shuffled Deck", 4);

        Collections.reverse(deck);
        Card.printDeck(deck, "Reversed Deck Of Cards",4);

        var sortingAlgorithm = Comparator.comparing(Card::rank)
                .thenComparing(Card::suit);
        Collections.sort(deck, sortingAlgorithm);
        Card.printDeck(deck, "Standard Deck sorted by rank, suit",13);
        Collections.reverse(deck);
        Card.printDeck(deck, "Sorted by rank, suit reversed: ",13);

//        deck.sort(sortingAlgorithm);
        Card tenOfHearts = Card.getNumericCard(Card.Suit.HEART, 10);
        int foundIndex = Collections.binarySearch(deck, tenOfHearts, sortingAlgorithm);
        System.out.println("foundIndex using the collections.binarysearch method "+foundIndex);
        System.out.println("foundIndex using the indexOf method "+deck.indexOf(tenOfHearts));
        System.out.println(deck.get(deck.indexOf(tenOfHearts)));
    }
}
