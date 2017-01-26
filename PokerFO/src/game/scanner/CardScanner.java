package game.scanner;

import com.game.card.Card;

import java.util.List;

public interface CardScanner {
    List<Card> parse(String input);
}
