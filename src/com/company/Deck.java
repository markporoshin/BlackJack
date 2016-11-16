package com.company;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by Mark on 09.11.2016.
 */
public class Deck extends LinkedList<Card>{
    public Deck() {
        super();
        for (Suit s: Suit.values())
            for (Value v: Value.values()) {
                this.add(new Card(s, v));
            }
        Collections.shuffle(this);
    }
}
