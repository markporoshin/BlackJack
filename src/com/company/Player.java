package com.company;

/**
 * Created by Mark on 09.11.2016.
 */
public abstract class Player {
    Hand hand = new Hand();
    private Intellect intellect;

    public Player(Intellect intellect) {
        this.intellect = intellect;
    }

    public void take(Card current) {
        hand.add(current);
    }

    public Command decision() {
        return intellect.decide(hand.countScore());
    }
}
