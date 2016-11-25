package com.company;

import java.util.LinkedList;

/**
 * Created by Mark on 09.11.2016.
 */
import java.util.LinkedList;

/**
 * Created by falyanguzov on 09.11.2016.
 */
public class Hand extends LinkedList<Card> {
    Player player;



    public Hand(Player player) {
        this.player = player;
    }

    public int countScore(){
        int sum = 0;
        for(Card c: this)
            sum += c.getScore();
        if(this.hasAce()&&sum+10<=21)
            sum += 10;
        return sum;
    }

    public Command decision(Intellect intellect) {
        return intellect.decideWithOverdraft(this.countScore());
    }
    private boolean hasAce(){
        return this.indexOf(new Card(Suit.SPADES, Value.ACE))>=0;
    }
}
