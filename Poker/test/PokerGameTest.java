import game.poker.PokerGame;
import game.poker.PokerHandType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PokerGameTest {

    private final PokerGame game = new PokerGame();

    private final String input = "HA H2 S3 D4 C5";

    @Test
    public void testPokerGame() {
        PokerHandType hand = game.play(input);
        assertEquals (hand, PokerHandType.STRAIGHT);
    }
}
