package com.poker.scanner;

import com.poker.card.Card;
import com.poker.card.Rank;
import com.poker.card.Suite;

import java.util.ArrayList;
import java.util.List;

public class CardScanner implements Scanner {

    @Override
    public List<Card> parse(String inputs) {
        String[] tokens = new String().split(" ");
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

        List<Card> cards = new ArrayList<Card>();
        for(String input : inputs) cards.add(parseToken(input));
        return cards;
    }

}
