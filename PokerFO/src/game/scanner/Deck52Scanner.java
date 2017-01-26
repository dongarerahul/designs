package game.scanner;

import com.game.card.Card;
import com.game.card.Rank;
import com.game.card.Suite;

import java.util.ArrayList;
import java.util.List;

public class Deck52Scanner implements CardScanner {

    @Override
    public List<Card> parse(String inputs) {
        String[] tokens = inputs.split(" ");
        return parseTokens(tokens);
    }

    public Card parseToken(String input) {
        if(input.length() != 2) throw new IllegalArgumentException("Invalid Card Input String");

        Suite suite = Suite.fromValue(input.substring(0, 1));
        Rank rank = Rank.fromValue(input.substring(1, 2));

        return new Card(suite, rank);
    }

    public List<Card> parseTokens(String[] inputs) {
        if(inputs.length < 1) throw new IllegalArgumentException("Invalid Card Inputs String");

        List<Card> cards = new ArrayList<>();
        for(String input : inputs) cards.add(parseToken(input.trim()));
        return cards;
    }
}
