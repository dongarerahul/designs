package com.game.poker.rule;

import com.game.card.Card;
import com.game.framework.Rule;
import com.game.poker.PokerHandType;

import java.util.List;

import static com.game.poker.PokerHandType.THREE_OF_A_KIND;

public class ThreeOfKindRule implements Rule {

    @Override
    public PokerHandType validate(List<Card> cards) {
        return THREE_OF_A_KIND;
    }

}
