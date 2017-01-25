import com.game.poker.rule.*;
import game.core.GameResult;
import game.core.Rule;
import game.poker.PokerGame;
import game.poker.PokerHandType;
import game.scanner.CardScanner;
import game.scanner.Deck52Scanner;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PokerGameTest {

    private final PokerGame game = new PokerGame();

    final String input = "HA H2 S3 D4 C5";

    @Test
    public void testDefaultPokerGame() {
        GameResult hand = game.play(input);
        assertEquals (hand, PokerHandType.FOUR_OF_KIND);
    }

    @Test
    public void testPokerGame() {
        final CardScanner scanner  = new Deck52Scanner();
        final Rule[] rules  = new Rule[] { new FourOfAKindRule() };

        PokerGame game = new PokerGame(scanner, rules);
        GameResult result = game.play(input);

        assertEquals(PokerHandType.FOUR_OF_KIND, result);
    }
}
