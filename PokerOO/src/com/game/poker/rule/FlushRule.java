package com.game.poker.rule;

import com.game.card.Card;
import com.game.card.Suite;
import com.game.framework.Result;
import com.game.framework.Rule;
import com.game.poker.PokerHandType;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlushRule implements Rule {

    @Override
    public Result validate(List<Card> cards) {
        Map<Suite, List<Card>> collatedSuite = cards.stream().collect(Collectors.groupingBy(Card::getSuite));
        return collatedSuite.size() == 1 ? PokerHandType.FLUSH : PokerHandType.NONE;
    }
}
