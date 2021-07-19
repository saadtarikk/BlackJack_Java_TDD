import java.util.ArrayList;

public class Card extends ArrayList<Card> {

    private CardValue cardValue;
    private CardSuit cardSuit;

    public Card(CardValue cardValue, CardSuit cardSuit) {
        this.cardValue = cardValue;
        this.cardSuit = cardSuit;
    }


    public CardValue getCardValue() {
        return cardValue;
    }

    public CardSuit getCardSuit() {
        return cardSuit;
    }
}
