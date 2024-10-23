package ru.dyankovskaya.savannah.entity;

public class Lion {
    private int health = 100;
    private int energy = 100;
    private final double APPETITE = 1.5;

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            this.health = 0;
        } else if (health > 100) {
            this.health = 100;
        } else {
            this.health = health;
        }
    }

    public int getEnergy() {
        return this.energy;
    }

    public void setEnergy(int energy) {
        if (energy < 0) {
            this.energy = 0;
        } else if (energy > 100) {
            this.energy = 100;
        } else {
            this.energy = energy;
        }
    }
    
    public double getAPPETITE() {
        return this.APPETITE;
    }
}