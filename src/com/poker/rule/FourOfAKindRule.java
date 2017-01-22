package com.poker.rule;

import com.poker.card.Card;
import game.poker.PokerHandType;

import java.util.List;

import static game.poker.PokerHandType.FOUR_OF_KIND;

public class FourOfAKindRule implements Rule {

    @Override
    public PokerHandType validate(List<Card> cards) {
        return FOUR_OF_KIND;
    }

}
