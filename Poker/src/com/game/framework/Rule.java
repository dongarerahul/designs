package com.game.framework;

import com.game.card.Card;

import java.util.List;

public interface Rule {

    public GameResult validate(List<Card> cards);
}
