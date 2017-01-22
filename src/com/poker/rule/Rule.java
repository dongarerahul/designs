package com.poker.rule;

import com.poker.card.Card;
import game.poker.PokerHandType;

import java.util.List;

public interface Rule {

    public PokerHandType validate(List<Card> cards);
}
