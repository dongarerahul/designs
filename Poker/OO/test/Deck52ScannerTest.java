import com.poker.card.Card;
import game.scanner.Deck52Scanner;
import com.poker.card.Rank;
import com.poker.card.Suite;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static com.poker.card.Rank.*;
import static com.poker.card.Rank.FIVE;
import static com.poker.card.Suite.*;
import static org.junit.Assert.assertEquals;

public class Deck52ScannerTest {

    private final Deck52Scanner scanner = new Deck52Scanner();

    @Test
    public void testParse() {
        assertEquals(createCards(HEART, ACE), scanner.parse("HA"));
        assertEquals(createCards(CLUB, TEN), scanner.parse("CT"));
        assertEquals(createCards(SPADE, TWO), scanner.parse("S2"));
    }

    private List<Card> createCards(Suite suite, Rank rank) {
        List<Card> cards = new ArrayList<>();
        cards.add(new Card(suite, rank));
        return cards;
    }

    @Test
    public void testSingleCardScanning() {
        assertEquals(createCards(DIAMOND, TEN), scanner.parse("DT"));
    }

    @Test
    public void testInputArrayScanning() {
        String[] inputs = {"HA", "H2", "S3", "D4", "C5"};
        List<Card> cards = scanner.parseTokens(inputs);
        validateCards(cards);
    }

    @Test
    public void testCardsStringScanning() {
        final String input = "HA H2 S3 D4 C5";
        List<Card> cards = scanner.parse(input);
        validateCards(cards);
    }

    private void validateCards(List<Card> cards) {
        Iterator<Card> iterator = cards.iterator();
        assertEquals(iterator.next(), new Card(HEART, ACE));
        assertEquals(iterator.next(), new Card(HEART, TWO));
        assertEquals(iterator.next(), new Card(SPADE, THREE));
        assertEquals(iterator.next(), new Card(DIAMOND, FOUR));
        assertEquals(iterator.next(), new Card(CLUB, FIVE));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidInputParse(){
        scanner.parse("THA");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidInputParse1(){
        scanner.parse("1");
    }
}
