package com.game.poker;

import com.game.framework.Result;
import com.game.framework.Rule;
import com.game.poker.rule.FourOfAKindRule;
import com.game.scanner.CardScanner;
import com.game.scanner.Deck52Scanner;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PokerGameTest {

    private final PokerGame game = new PokerGame();

    final String flushCards = "HA H2 S3 D4 C5";

    @Test
    public void testDefaultPokerGame() {
        Result hand = game.play(flushCards);
        assertEquals (hand, PokerHandType.FOUR_OF_KIND);
    }

    @Test
    public void testPokerGame() {
        final CardScanner scanner  = new Deck52Scanner();
        final Rule[] rules  = new Rule[] { new FourOfAKindRule() };

        PokerGame game = new PokerGame(scanner, rules);
        Result result = game.play(flushCards);

        assertEquals(PokerHandType.FOUR_OF_KIND, result);
    }
}
