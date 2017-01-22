package com.poker.card;

public class Card {
    private final Rank rank;
    private final Suite suite;

    public Card(Suite suite, Rank rank) {
        this.suite = suite;
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }

    public Suite getSuite() {
        return suite;
    }

    @Override
    public boolean equals(Object object) {
        Card card = (Card) object;
        return card.getRank() == rank && card.getSuite() == suite;
    }
}
