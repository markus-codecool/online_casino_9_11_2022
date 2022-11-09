package com.codecool.data;

public class Dealer {
    private final String name;
    private DealerExperience experience;

    public Dealer(String name, DealerExperience experience) {
        this.name = name;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public DealerExperience getExperience() {
        return experience;
    }

    public void setExperience(DealerExperience experience) {
        this.experience = experience;
    }
}
