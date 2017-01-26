package game.poker.rule;

import com.game.card.Card;
import com.game.framework.Rule;
import com.game.poker.PokerHandType;

import java.util.List;

import static com.game.poker.PokerHandType.STRAIGHT;

public class StraightRule implements Rule {

    @Override
    public PokerHandType validate(List<Card> cards) {
        return STRAIGHT;
    }

}
