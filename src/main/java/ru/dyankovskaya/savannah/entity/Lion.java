package ru.dyankovskaya.savannah.entity;

public class Lion {
    private int health = 100;
    private int energy = 100;
    private final double APPETITE = 1.5;

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return this.energy;
    }

    public double getAPPETITE() {
        return this.APPETITE;
    }
}