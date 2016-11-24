package com.company;

import java.util.Random;

/**
 * Created by Mark on 16.11.2016.
 */
public class Computer extends Player {
    static String[] names = {"Coward", "Stupid", "Stager"};

    @Override
    public void setBet() {
        bet = new HalfBetter();
        super.setBet();
    }

    public Computer(Intellect intellect, int money) {

        super(intellect, names[(int)(Math.random()*names.length)], money);
    }
}
