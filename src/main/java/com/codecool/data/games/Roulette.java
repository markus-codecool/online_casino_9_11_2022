package com.codecool.data.games;

import com.codecool.data.Dealer;

public class Roulette extends Game {
    private static final double ROULETTE_DAILY_REVENUE = 2_000_000;
    private static final int ROULETTE_PLAYER_COUNT = 8;

    private Dealer dealer;

    public Roulette(int id) {
        super(id, ROULETTE_PLAYER_COUNT, ROULETTE_DAILY_REVENUE);
    }

    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }
}
