package com.company;

/**
 * Created by Mark on 09.11.2016.
 */
public class Human extends Player {
    public Human(String name, int money) {
        super(new HumanIntellect(), name, money);
    }

    @Override
    public void setBet() {
        bet = new HumanBetter();
        super.setBet();
    }
}
