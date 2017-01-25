package com.game.poker.rule;

import com.game.card.Card;
import com.game.framework.GameResult;
import com.game.framework.Rule;
import com.game.poker.PokerHandType;

import java.util.List;

public class FlushRule implements Rule {

    @Override
    public GameResult validate(List<Card> cards) {
        return PokerHandType.FLUSH;
    }
}
