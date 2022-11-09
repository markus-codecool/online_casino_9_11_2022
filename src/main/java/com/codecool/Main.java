package com.codecool;

import com.codecool.data.Casino;
import com.codecool.data.Dealer;
import com.codecool.data.DealerExperience;
import com.codecool.data.games.BlackJack;
import com.codecool.data.games.Roulette;
import com.codecool.data.games.SlotMachine;
import com.codecool.service.ProfitCalculationService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProfitCalculationService profitCalculationService = new ProfitCalculationService();
        Casino casino = new Casino();
        casino.setBank(420);

        Roulette roulette = new Roulette(1);
        BlackJack blackJack = new BlackJack(3);
        SlotMachine slotMachine = new SlotMachine(4);
        casino.setGames(List.of(roulette, slotMachine));

        Dealer david = new Dealer("Dave", DealerExperience.PRO);
        roulette.setDealer(david);
        casino.setDealers(List.of(david, david));

        double profit = profitCalculationService.calculateDailyProfit(casino);
        System.out.println("profit = " + profit);

        blackJack.setBank(1000);
        roulette.setBank(2000);
        double balance = profitCalculationService.calculateTotalBalance(casino);
        System.out.println("balance = " + balance);
    }
}