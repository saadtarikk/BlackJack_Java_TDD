import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player;
    private Player player1;

    private Deck deck;
    private Card card;

    @Before
    public void before(){
        player = new Player("Saad");
        player1 = new Player("Elaine");
        deck = new Deck();
    }

    @Test
    public void hasName() {
        assertEquals("Saad", player.getName());
    }

    @Test
    public void playerStartsWithNoHand() {
        assertEquals(0, player.getHand().size());
    }

    @Test
    public void canDealHand() {
        deck.populateDeck();
        deck.shuffleDeck();
        player.setHand(deck.dealCard());
        player1.setHand(deck.dealCard());
        assertEquals(50, deck.getCards().size());
    }
}