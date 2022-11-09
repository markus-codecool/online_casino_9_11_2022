package com.codecool.service;

import com.codecool.data.Casino;
import com.codecool.data.Dealer;
import com.codecool.data.games.Game;

public class ProfitCalculationService {
    public double calculateDailyProfit(Casino casino) {
        double result = 0;
        for (Game game : casino.getGames()) {
            result += game.getDailyRevenue();
        }
        for (Dealer dealer : casino.getDealers()) {
            result -= dealer.getExperience().getSalary();
        }
        return result;
    }

    public double calculateTotalBalance(Casino casino) {
        double result = casino.getBank();
        for (Game game : casino.getGames()) {
            result += game.getBank();
        }
        return result;
    }
}
