package com.game.poker;

import com.game.framework.Game;
import com.game.framework.Rule;
import com.game.poker.rule.FlushRule;
import com.game.poker.rule.StraightRule;
import com.game.scanner.CardScanner;
import com.game.scanner.Deck52Scanner;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RuleTest {
    private final CardScanner scanner = new Deck52Scanner();
    private final Rule[] rule = {new FlushRule(), new StraightRule()};
    private final Game game = new PokerGame(scanner, rule);
    
    @Test
    public void testFlushRule(){
        assertEquals(PokerHandType.FLUSH, game.play("HA H2 H3 H4 H5"));
    }

    @Test
    public void testStraightRule(){
        assertEquals(PokerHandType.STRAIGHT, game.play("H2 S3 D4 C5 H6"));
    }
}
