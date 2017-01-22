import com.poker.card.Rank;
import com.poker.card.Suite;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CardSuiteTest {

    @Test
    public void createCardSuite() {
        Suite suite = Suite.fromValue("H");
        assertEquals("HEART", suite.toString());
        assertEquals(Suite.HEART, suite);
        assertEquals("H", suite.getSuite());
    }

    @Test
    public void createInvalidSuite() {
        Suite suite = Suite.fromValue("X");
        assertEquals(Rank.INVALID, suite);
    }
}
