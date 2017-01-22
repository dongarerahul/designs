package com.poker.rule;

import com.poker.card.Card;
import game.poker.PokerHandType;

import java.util.List;

import static game.poker.PokerHandType.STRAIGHT;

public class StraightRule implements Rule {

    @Override
    public PokerHandType validate(List<Card> cards) {
        return STRAIGHT;
    }

}
