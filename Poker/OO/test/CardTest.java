import com.poker.card.Card;
import com.poker.card.Rank;
import com.poker.card.Suite;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    @Test
    public void testCardCreation() {
        Card card = new Card(Suite.HEART, Rank.ACE);
        assertEquals("Card: HEART ACE", card.toString());
        assertEquals(Suite.HEART, card.getSuite());
        assertEquals(Rank.ACE, card.getRank());
        assertEquals(new Card(Suite.HEART, Rank.ACE), card);
    }
}
