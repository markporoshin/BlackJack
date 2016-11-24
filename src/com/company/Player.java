package com.company;

import static com.company.PlayerState.WIN;

/**
 * Created by Mark on 09.11.2016.
 */
public abstract class Player {
    Hand hand = new Hand();
    PlayerState state;
    String name;
    Better bet;
    int money;
    private Intellect intellect;

    public Player(Intellect intellect, String name, int money) {
        this.name = name;
        this.intellect = intellect;
        this.money = money;
    }

    public void setBet(){
        money -= bet.bet;
    }

    public void decideBet(){
        if(this.state == WIN){
            money += 2 * bet.bet;
        }
    }

    public void take(Card current) {
        hand.add(current);
    }

    public Command decision() {
        return intellect.decideWithOverdraft(hand.countScore());
    }
}
