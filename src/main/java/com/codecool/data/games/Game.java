package com.codecool.data.games;

public abstract class Game {
    private double bank;
    private final int id;
    private final int players;
    private final double dailyRevenue;

    protected Game(int id, int players, double dailyRevenue) {
        this.bank = 0;
        this.id = id;
        this.players = players;
        this.dailyRevenue = dailyRevenue;
    }

    public double getBank() {
        return bank;
    }

    public void setBank(double bank) {
        this.bank = bank;
    }

    public int getId() {
        return id;
    }

    public int getPlayers() {
        return players;
    }

    public double getDailyRevenue() {
        return dailyRevenue;
    }
}
