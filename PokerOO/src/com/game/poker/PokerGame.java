package com.game.poker;

import com.game.framework.Game;
import com.game.framework.Result;
import com.game.framework.Rule;
import com.game.scanner.CardScanner;
import com.game.scanner.Deck52Scanner;
import com.game.card.Card;
import com.game.poker.rule.*;

import java.util.List;

public class PokerGame implements Game {

    private final CardScanner scanner;
    private final Rule[] rules;

    public PokerGame(CardScanner scanner, Rule[] rules) {
        this.scanner = scanner;
        this.rules = rules;
    }

    public PokerGame() {
        scanner  = new Deck52Scanner();
        rules  = new Rule[] {
            new FourOfAKindRule(),
            new FullHouseRule(),
            new FlushRule(),
            new StraightRule(),
            new ThreeOfKindRule(),
            new PairRule(),
            new HighCardRule()
        };
    }

    @Override
    public Result play(String inputs) {
        List<Card> cards = scanner.parse(inputs);
        for(Rule rule : rules) {
            Result hand = rule.validate(cards);
            if(hand != PokerHandType.NONE) return hand;
        }
        return PokerHandType.NONE;
    }
}
