package com.poker.rule;

import com.poker.card.Card;
import game.poker.PokerHandType;

import java.util.List;

import static game.poker.PokerHandType.THREE_OF_A_KIND;

public class ThreeOfKindRule implements Rule {

    @Override
    public PokerHandType validate(List<Card> cards) {
        return THREE_OF_A_KIND;
    }

}
