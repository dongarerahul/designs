package com.game.poker;

import com.game.card.Card;
import com.game.framework.Rule;
import com.game.poker.rule.StraightRule;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.game.card.Rank.*;
import static com.game.card.Suite.*;
import static org.junit.Assert.assertEquals;

public class RuleTest {
    
    private final Rule evaluator = new StraightRule();
    
    @Test
    public void testValidate(){
        List<Card> list = new ArrayList<Card>();
        list.add(new Card(HEART, ACE));
        list.add(new Card(HEART, TWO));
        list.add(new Card(SPADE, THREE));
        list.add(new Card(DIAMOND, FOUR));
        list.add(new Card(CLUB, FIVE));
        
        assertEquals(PokerHandType.STRAIGHT, evaluator.validate(list));
    }
}
