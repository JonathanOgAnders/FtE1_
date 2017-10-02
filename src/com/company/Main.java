package com.company;

public class Main {

    public static void main(String[] args) {

        Game game = new Game(1  , 0);
        game.timer.setStartTime();
        game.recMoveBille(game.bille.getCurrentPoint());
        game.timer.setEndTime();
        System.out.println(game.timer.calcTime());
    }
}
