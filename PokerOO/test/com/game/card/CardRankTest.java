package com.game.card;

import com.game.card.Rank;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardRankTest {

    @Test
    public void createCardRanks() {
        Rank rank = Rank.fromValue("A");
        assertEquals("ACE", rank.toString());
        assertEquals(Rank.ACE, rank);
        assertEquals("A", rank.getRank());
    }

    @Test
    public void createTenRank() {
        assertEquals(Rank.TEN, Rank.fromValue("T"));
    }

    @Test
    public void createInvalidRank() {
        Rank rank = Rank.fromValue("X");
        assertEquals(Rank.INVALID, rank);
    }
}
