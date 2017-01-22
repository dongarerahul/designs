package com.poker.scanner;

import com.poker.card.Card;

import java.util.List;

public interface Scanner {
    List<Card> parse(String input);
}
