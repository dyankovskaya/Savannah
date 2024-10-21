package ru.dyankovskaya.savannah.util;

import ru.dyankovskaya.savannah.entity.Lion;

public class VitalsCheck {

    public static int checkHealthUpperBorder(Lion lion) {
        int health = lion.getHealth();
        if (health > 100) {
            health = 100;
        }
        return health;
    }

    public static int checkEnergyUpperBorder(Lion lion) {
        int energy = lion.getEnergy();
        if (energy > 100) {
            energy = 100;
        }
        return energy;
    }

}
