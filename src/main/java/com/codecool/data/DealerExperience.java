package com.codecool.data;

public enum DealerExperience {
    NEWBIE(50_000, "Noob"),
    MID_LEVEL(80_000, "OK"),
    PRO(120_000, "The Dave");

    private final double salary;

    DealerExperience(double salary, String title) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
