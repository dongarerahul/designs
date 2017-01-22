import com.poker.card.Card;
import com.poker.scanner.CardScanner;
import com.poker.card.Rank;
import com.poker.card.Suite;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

import static com.poker.card.Rank.*;
import static com.poker.card.Rank.FIVE;
import static com.poker.card.Suite.*;
import static org.junit.Assert.assertEquals;

public class CardScannerTest {

    private final CardScanner scanner = new CardScanner();

    @Test
    public void testParse() {
        assertEquals(new Card(Suite.HEART, Rank.ACE), scanner.parse("HA"));
        assertEquals(new Card(Suite.CLUB, Rank.TEN), scanner.parse("CT"));
        assertEquals(new Card(Suite.SPADE, Rank.TWO), scanner.parse("S2"));
    }

    @Test
    public void testInputScanning() {
        assertEquals(new Card(DIAMOND, TEN), scanner.parse("DT"));
    }

    @Test
    public void testInputArrayScanning() {
        String[] inputs = {"HA", "H2", "S3", "D4", "C5"};

        List<Card> cards = scanner.parseTokens(inputs);
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
