package com.game.poker.rule;

import com.game.card.Card;
import com.game.framework.Rule;
import com.game.poker.PokerHandType;

import java.util.Comparator;
import java.util.List;

public class StraightRule implements Rule {

    @Override
    public PokerHandType validate(List<Card> cards) {

        if(cards.size() != 5) return PokerHandType.NONE;

        Comparator<Card> comparator = (card1, card2) -> card1.getRank().ordinal() - card2.getRank().ordinal();

        int max = cards.stream().max(comparator).get().getRank().ordinal();
        int min = cards.stream().min(comparator).get().getRank().ordinal();
        return (max - min) == 4 ? PokerHandType.STRAIGHT : PokerHandType.NONE;
    }

}
