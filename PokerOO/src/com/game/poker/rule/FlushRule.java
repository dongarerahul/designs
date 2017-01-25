package com.game.poker.rule;

import com.game.card.Card;
import com.game.framework.Result;
import com.game.framework.Rule;
import com.game.poker.PokerHandType;

import java.util.List;

public class FlushRule implements Rule {

    @Override
    public Result validate(List<Card> cards) {
        return PokerHandType.FLUSH;
    }
}
