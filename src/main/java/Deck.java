import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> deckOfCards;
//    Card card;
    Player player;

    public Deck() {
        this.deckOfCards = new ArrayList<>();
    }



    public void addCard(Card card) {
        deckOfCards.add(card);
    }

    public void populateDeck() {
        for(CardSuit suit : CardSuit.values()){
            for(CardValue value : CardValue.values()){
                deckOfCards.add(new Card(value, suit));
            }
        }
    }
    public ArrayList<Card> getCards() {
        return deckOfCards;
    }

    public void shuffleDeck() {
        Collections.shuffle(deckOfCards);
    }

    public ArrayList<Card> dealTwoCard() {
        ArrayList<Card> dealCards = new ArrayList<>();
        dealCards.add(deckOfCards.get(0));
        dealCards.add(deckOfCards.get(1));
        deckOfCards.remove(0);
        deckOfCards.remove(1);
        return dealCards;
    }

    public Card dealCard() {
        Card card = deckOfCards.get(2);
        deckOfCards.remove(2);
        return card;
    }
}
