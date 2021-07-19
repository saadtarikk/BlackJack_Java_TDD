import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    private Card card;

    @Before
    public void before() {
        card = new Card(CardValue.ACE, CardSuit.HEARTS);
    }

    @Test
    public void canCheckValue() {
        assertEquals(1, card.getCardValue().getValue());
    }

    @Test
    public void canCheckSuit() {
        assertEquals("Hearts", card.getCardSuit().getSuit());
    }
}
