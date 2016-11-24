package com.company;


import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Table table = new Table();
        table.initTable();
        String nr;
        do{
            table.startRound();
            table.playRound();
            table.decideWinner();
            table.endRound();
            table.decideBet();
            System.out.println("начать новый раунд?");
            nr = HumanIntellect.in.nextLine();
        }while ("yes".startsWith(nr.toLowerCase()) && table.exit);
    }
}
