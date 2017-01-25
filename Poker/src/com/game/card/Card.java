package com.game.card;

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
        if(this == object) return true;
        if(!(object instanceof Card)) return false;

        Card anotherCard = (Card) object;
        return anotherCard.getRank() == rank && anotherCard.getSuite() == suite;
    }

    @Override
    public String toString() {
        return "Card: " + suite + " " + rank;
    }
}
