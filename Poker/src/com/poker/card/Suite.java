package com.poker.card;

public enum Suite {

    SPADE("S"), HEART("H"), DIAMOND("D"), CLUB("C"), INVALID("?");

    private String suite;

    Suite(String suite) {
        this.suite = suite;
    }

    public String getSuite() {
        return suite;
    }

    public static Suite fromValue(String value) {
        for(Suite suite : Suite.values()) {
            if(suite.getSuite().equals(value)) return suite;
        }
        return INVALID;
    }
}
