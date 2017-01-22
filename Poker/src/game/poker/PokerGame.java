package game.poker;

import com.poker.card.Card;
import com.poker.rule.*;
import com.poker.scanner.CardScanner;
import com.poker.scanner.Scanner;
import game.Game;

import java.util.List;

public class PokerGame implements Game {

    private final Scanner scanner;
    private final Rule[] rules;

    public PokerGame(Scanner scanner, Rule[] rules) {
        this.scanner = scanner;
        this.rules = rules;
    }

    public PokerGame() {
        scanner  = new CardScanner();
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
    public PokerHandType play(String inputs) {
        List<Card> cards = scanner.parse(inputs);
        for(Rule rule : rules) {
            PokerHandType hand = rule.validate(cards);
            if(hand != PokerHandType.NONE) return hand;
        }
        return PokerHandType.NONE;
    }
}
