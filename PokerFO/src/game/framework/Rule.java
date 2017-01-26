package game.framework;

import com.game.card.Card;

import java.util.List;

public interface Rule {

    public Result validate(List<Card> cards);
}
