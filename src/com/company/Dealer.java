package com.company;

/**
 * Created by Mark on 09.11.2016.
 */
public class Dealer extends Player {
    private Deck deck = new Deck();

    public Dealer() {
        super(new DealerIntelect());
    }

    public void deal(Player player) {
        Card current = this.deck.pop();
        player.take(current);
    }
}
