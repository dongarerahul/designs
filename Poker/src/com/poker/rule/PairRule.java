package com.poker.rule;

import com.poker.card.Card;
import game.poker.PokerHandType;

import java.util.List;

public class PairRule implements Rule {

    @Override
    public PokerHandType validate(List<Card> cards) {
        return PokerHandType.PAIR;
    }
}
