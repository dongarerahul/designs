package com.game.card;

import com.game.card.Suite;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
        assertEquals(Suite.INVALID, suite);
    }
}
