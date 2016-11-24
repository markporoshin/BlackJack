package com.company;

/**
 * Created by Mark on 09.11.2016.
 */
public class Dealer extends Computer {
    private Deck deck = new Deck();

    @Override
    public void decideBet() {;}

    @Override
    public void setBet() {
        super.setBet();
    }

    public Dealer() {
        super(new DealerIntelect(), 0);
        this.name =  "Dealer";
    }

    public void deal(Player player) {
        if(deck.isEmpty())
            deck = new Deck();

        Card current = this.deck.pop();
        player.take(current);
    }
}
