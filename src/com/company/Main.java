package com.company;


import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Hand h = new Hand();
        h.add(new Card(Suit.SPADES, Value.ACE));
        h.add(new Card(Suit.DIAMONDS, Value.ACE));

        System.out.println(h.countScore());
        List<Player> players = new LinkedList<Player>();
        Dealer dealer = new Dealer();

        players.add(new Computer(new LimitIntellect(14)));
        players.add(new Computer(new LimitIntellect(20)));
        players.add(new Human());
        players.add(dealer);

        for(Player player: players){
            dealer.deal(player);
            dealer.deal(player);
        }
        for(Player player: players) {
            System.out.println(player.hand + " " + player.hand.countScore());
            Command command;
            do{
                System.out.println(""+player.hand.countScore()+": "+player.hand);
                command = player.decision();
                switch (command){
                    case HIT: dealer.deal(player);break;
                }
            }while(command!=Command.STAND);
        }
        for(Player player: players)
            while(player.decision()!=Command.STAND){
                dealer.deal(player);
            }

    }
}
