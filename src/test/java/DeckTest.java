import com.sun.jdi.Value;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    private Deck deck;
    private Card card;

    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void deckStartsEmpty() {
        assertEquals(0, deck.getCards().size());
    }

    @Test
    public void canAddCardToDeck() {
        deck.addCard(card);
        assertEquals(1, deck.getCards().size());
    }

    @Test
    public void canPopulateDeck() {
        deck.populateDeck();
        assertEquals(52, deck.getCards().size());
    }

    @Test
    public void checkDeckHasKingOfClubs() {
        deck.populateDeck();
        assertEquals(CardSuit.CLUBS, deck.getCards().get(2).getCardSuit());
        assertEquals(CardValue.KING, deck.getCards().get(12).getCardValue());
    }

    @Test
    public void canShuffleDeck(){
        deck.populateDeck();
        deck.shuffleDeck();
        assertNotEquals("CLUBS", deck.getCards().get(0).getCardSuit());
        assertNotEquals(1, deck.getCards().get(0).getCardValue());
    }

    @Test
    public void canDealCards(){
        deck.populateDeck();
        deck.shuffleDeck();
        assertEquals(2, deck.dealTwoCard().size());
    }

    @Test
    public void canDealSingleCard() {
        deck.populateDeck();
        deck.shuffleDeck();
        deck.dealCard();
        assertEquals(51, deck.getCards().size());
    }

}
