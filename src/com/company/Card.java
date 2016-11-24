package com.company;

/**
 * Created by Mark on 09.11.2016.
 */
public class Card {
    Suit suit;
    Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return "" + value + " of " + suit;
    }

    public int getScore() {
        return this.value.getScore();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        return value == card.value;
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }
}
