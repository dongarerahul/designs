package com.poker.card;

public enum Rank {
    ACE("A"), KING("K"), QUEEN("Q"), JACK("J"),
    TEN("T"), NINE("9"), EIGHT("8"), SEVEN("7"), SIX("6"), FIVE("5"),
    FOUR("4"), THREE("3"), TWO("2"), INVALID("?");

    private final String rank;

    Rank(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public static Rank fromValue(String value) {
        for (Rank rank : Rank.values()) {
            if (rank.getRank().equals(value)) return rank;
        }
        return INVALID;
    }
}
