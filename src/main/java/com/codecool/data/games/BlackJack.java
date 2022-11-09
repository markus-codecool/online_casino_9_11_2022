package com.codecool.data.games;

import com.codecool.data.Dealer;

public class BlackJack extends Game {
    private static final double BLACK_JACK_DAILY_REVENUE = 1_000_000;
    private static final int BLACK_JACK_PLAYER_COUNT = 6;

    private Dealer dealer;

    public BlackJack(int id) {
        super(id, BLACK_JACK_PLAYER_COUNT, BLACK_JACK_DAILY_REVENUE);
    }

    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }
}
