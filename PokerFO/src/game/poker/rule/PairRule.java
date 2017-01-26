package game.poker.rule;

import com.game.card.Card;
import com.game.framework.Rule;
import com.game.poker.PokerHandType;

import java.util.List;

public class PairRule implements Rule {

    @Override
    public PokerHandType validate(List<Card> cards) {
        return PokerHandType.PAIR;
    }
}
