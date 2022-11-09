package com.codecool.data;

import com.codecool.data.games.Game;

import java.util.List;

public class Casino {
    private double bank;
    private List<Game> games;
    private List<Dealer> dealers;

    public double getBank() {
        return bank;
    }

    public void setBank(double bank) {
        this.bank = bank;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    public List<Dealer> getDealers() {
        return dealers;
    }

    public void setDealers(List<Dealer> dealers) {
        this.dealers = dealers;
    }
}
