package com.codecool.data.games;

import com.codecool.data.Dealer;

public class SlotMachine extends Game {
    private static final double SLOT_MACHINE_DAILY_REVENUE = 500_000;
    private static final int SLOT_MACHINE_PLAYER_COUNT = 1;
    private int rollsSinceLastWin;

    public SlotMachine(int id) {
        super(id, SLOT_MACHINE_PLAYER_COUNT, SLOT_MACHINE_DAILY_REVENUE);
        rollsSinceLastWin = 0;
    }

    public void incrementRollsSinceLastWin() {
        rollsSinceLastWin++;
    }

    public void resetRollsSinceLastWin() {
        rollsSinceLastWin = 0;
    }

    public int getRollsSinceLastWin() {
        return rollsSinceLastWin;
    }
}
