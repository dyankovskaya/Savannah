package ru.dyankovskaya.savannah.util;

import ru.dyankovskaya.savannah.entity.Lion;

public class EventSimulator {

    public void startSimulation(Lion lion) {
        while (checkStatus(lion)) {
            int eventNum = (int) (Math.random() * 100);
            if (eventNum >= 0 && eventNum < 18) {
                sleep(lion);
            } else if (eventNum >= 18 && eventNum < 28) {
                exhausted(lion);
            } else if (eventNum >= 28 && eventNum < 36) {
                eatZebra(lion);
            } else if (eventNum >= 36 && eventNum < 44) {
                eatGazelle(lion);
            } else if (eventNum >= 44 && eventNum < 54) {
                eatHyena(lion);
            } else if (eventNum >= 54 && eventNum < 60) {
                lionKing(lion);
            } else if (eventNum >= 60 && eventNum < 73) {
                hunter(lion);
            } else if (eventNum >= 73 && eventNum < 80) {
                thorn(lion);
            } else if (eventNum >= 80 && eventNum < 90) {
                fight(lion);
            } else if (eventNum > 90) {
                hakunaMatata(lion);
            }
        }
        System.out.println("Unfortunately the lion died.");
    }

    private void sleep(Lion lion) {
        int energy = lion.getEnergy();
        energy = energy + 20;
        lion.setEnergy(energy);
        checkStatus(lion);
        System.out.println("The lion had a rest! Current health: " + lion.getHealth() +
                ". Current energy: " + lion.getEnergy());
        warning(lion);
    }

    private void exhausted(Lion lion) {
        int energy = lion.getEnergy();
        energy = energy - 10;
        lion.setEnergy(energy);
        checkStatus(lion);
        System.out.println("Ops... The lion didn't catch anyone this time. Current health: "
                + lion.getHealth() + ". Current energy: " + lion.getEnergy());
        warning(lion);
    }

    private void eatZebra(Lion lion) {
        int health = lion.getHealth();
        int energy = lion.getEnergy();
        health = health + (int) (lion.getAPPETITE() * 10);
        energy = energy - 10;
        lion.setHealth(health);
        lion.setEnergy(energy);
        checkStatus(lion);
        System.out.println("Great! The lion ate a zebra! Current health: " + lion.getHealth() +
                ". Current energy: " + lion.getEnergy());
        warning(lion);
    }

    private void eatGazelle(Lion lion) {
        int health = lion.getHealth();
        int energy = lion.getEnergy();
        health = health + (int) (lion.getAPPETITE() * 12);
        energy = energy - 10;
        lion.setHealth(health);
        lion.setEnergy(energy);
        checkStatus(lion);
        System.out.println("Excellent hunting! The lion caught a gazelle! Current health: "
                + lion.getHealth() + ". Current energy: " + lion.getEnergy());
        warning(lion);
    }

    private void eatHyena(Lion lion) {
        int health = lion.getHealth();
        int energy = lion.getEnergy();
        health = health + (int) (lion.getAPPETITE() * 8);
        energy = energy - 8;
        lion.setHealth(health);
        lion.setEnergy(energy);
        checkStatus(lion);
        System.out.println("The hyena was fast, but not fast enough! Current health: "
                + lion.getHealth() + ". Current energy: " + lion.getEnergy());
        warning(lion);
    }

    private void lionKing(Lion lion) {
        int energy = lion.getEnergy();
        energy = energy + 8;
        lion.setEnergy(energy);
        checkStatus(lion);
        System.out.println("The lion roared demonstratively like a king! He looks constantly! " +
                "Current health: " + lion.getHealth() + ". Current energy: " + lion.getEnergy());
        warning(lion);
    }

    private void hunter(Lion lion) {
        int health = lion.getHealth();
        int energy = lion.getEnergy();
        health = health - 20;
        energy = energy - 15;
        lion.setHealth(health);
        lion.setEnergy(energy);
        checkStatus(lion);
        System.out.println("The hunters were on the trail! The lion had to run away and hide! " +
                "Current health: " + lion.getHealth() + ". Current energy: " + lion.getEnergy());
        warning(lion);
    }

    private void thorn(Lion lion) {
        int health = lion.getHealth();
        health = health - 5;
        lion.setHealth(health);
        checkStatus(lion);
        System.out.println("The lion stuck a thorn into his paw! Current health: "
                + lion.getHealth() + ". Current energy: " + lion.getEnergy());
        warning(lion);
    }

    private void fight(Lion lion) {
        int health = lion.getHealth();
        int energy = lion.getEnergy();
        health = health - 10;
        energy = energy - 10;
        lion.setHealth(health);
        lion.setEnergy(energy);
        checkStatus(lion);
        System.out.println("The lion had to fight to show who is the real leader! " +
                "Current health: " + lion.getHealth() + ". Current energy: " + lion.getEnergy());
        warning(lion);
    }

    private void hakunaMatata(Lion lion) {
        int energy = lion.getEnergy();
        energy = energy + 7;
        lion.setEnergy(energy);
        checkStatus(lion);
        System.out.println("Hakuna matata! It was great to spend time with Timon and Pumba! " +
                "The lion got energized! Current health: " + lion.getHealth() +
                ". Current energy: " + lion.getEnergy());
        warning(lion);
    }

    private boolean checkStatus(Lion lion) {
        if (lion.getHealth() <= 0) {
            return false;
        } else
            return true;
    }

    private void warning(Lion lion) {
        if (lion.getEnergy() == 0) {
            lion.setHealth(lion.getHealth() - 5);
            System.out.println("Seems like the lion needs some rest! Current health: " + lion.getHealth());
        }
    }
}