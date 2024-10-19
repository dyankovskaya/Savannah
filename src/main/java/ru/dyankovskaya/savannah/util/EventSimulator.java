package ru.dyankovskaya.savannah.util;

import ru.dyankovskaya.savannah.entity.Lion;

public class EventSimulator {
    public void startSimulation(Lion lion) {
        while (checkStatus(lion)) {
            int eventNum = (int) (Math.random() * 100);
            if (eventNum >= 0 && eventNum < 25) {
                sleep(lion);
            } else if (eventNum >= 25 && eventNum < 35) {
                exhausted(lion);
            } else if (eventNum >= 35 && eventNum < 43) {
                eatZebra(lion);
            } else if (eventNum >= 43 && eventNum < 51) {
                eatGazelle(lion);
            } else if (eventNum >= 51 && eventNum < 61) {
                eatHyena(lion);
            } else if (eventNum >= 61 && eventNum < 71) {
                lionKing(lion);
            } else if (eventNum >= 71 && eventNum < 84) {
                hunter(lion);
            } else if (eventNum >= 84 && eventNum < 88) {
                thorn(lion);
            } else if (eventNum >= 88 && eventNum < 93) {
                fight(lion);
            } else if (eventNum > 93) {
                hakunaMatata(lion);
            }
        }
        System.out.println("Unfortunately the lion died.");
    }

    private void sleep(Lion lion) {
        int energy = lion.getEnergy();
        energy = energy + 20;
        if (energy > 100) {
            energy = 100;
        }
        lion.setEnergy(energy);
        checkEnergy(lion);
        System.out.println("The lion had a rest! Current health: " + lion.getHealth() + ". Current energy: " + lion.getEnergy());
    }

    private void exhausted(Lion lion) {
        int energy = lion.getEnergy();
        energy = energy - 5;
        if (energy < 0) {
            energy = 0;
        }
        lion.setEnergy(energy);
        checkEnergy(lion);
        System.out.println("Ops... The lion didn't catch anyone this time. Current health: " + lion.getHealth() + ". Current energy: " + lion.getEnergy());
    }

    private void eatZebra(Lion lion) {
        int health = lion.getHealth();
        int energy = lion.getEnergy();
        health = health + (int) (lion.getAPPETITE() * 15);
        if (health > 100) {
            health = 100;
        }
        energy = energy - 5;
        if (energy < 0) {
            energy = 0;
        }
        lion.setHealth(health);
        lion.setEnergy(energy);
        checkEnergy(lion);
        System.out.println("Great! The lion ate a zebra! Current health: " + lion.getHealth() + ". Current energy: " + lion.getEnergy());
    }

    private void eatGazelle(Lion lion) {
        int health = lion.getHealth();
        int energy = lion.getEnergy();
        health = health + (int) (lion.getAPPETITE() * 17);
        if (health > 100) {
            health = 100;
        }
        energy = energy - 5;
        if (energy < 0) {
            energy = 0;
        }
        lion.setHealth(health);
        lion.setEnergy(energy);
        checkEnergy(lion);
        System.out.println("Excellent hunting! The lion caught a gazelle! Current health: " + lion.getHealth() + ". Current energy: " + lion.getEnergy());
    }

    private void eatHyena(Lion lion) {
        int health = lion.getHealth();
        int energy = lion.getEnergy();
        health = health + (int) (lion.getAPPETITE() * 8);
        if (health > 100) {
            health = 100;
        }
        energy = energy - 5;
        if (energy < 0) {
            energy = 0;
        }
        lion.setHealth(health);
        lion.setEnergy(energy);
        checkEnergy(lion);
        System.out.println("The hyena was fast, but not fast enough! Current health: " + lion.getHealth() + ". Current energy: " + lion.getEnergy());
    }

    private void lionKing(Lion lion) {
        int energy = lion.getEnergy();
        energy = energy + 10;
        if (energy > 100) {
            energy = 100;
        }
        lion.setEnergy(energy);
        checkEnergy(lion);
        System.out.println("The lion roared demonstratively like a king! He looks constantly! Current health: " + lion.getHealth() + ". Current energy: " + lion.getEnergy());
    }

    private void hunter(Lion lion) {
        int health = lion.getHealth();
        int energy = lion.getEnergy();
        health = health - 20;
        if (health < 0) {
            health = 0;
        }
        energy = energy - 15;
        if (energy < 0) {
            energy = 0;
        }
        lion.setHealth(health);
        lion.setEnergy(energy);
        checkEnergy(lion);
        System.out.println("The hunters were on the trail! The lion had to run away and hide! Current health: " + lion.getHealth() + ". Current energy: " + lion.getEnergy());
    }

    private void thorn(Lion lion) {
        int health = lion.getHealth();
        health = health - 5;
        if (health < 0) {
            health = 0;
        }
        lion.setHealth(health);
        System.out.println("The lion stuck a thorn into his paw! Current health: " + lion.getHealth() + ". Current energy: " + lion.getEnergy());
    }

    private void fight(Lion lion) {
        int health = lion.getHealth();
        int energy = lion.getEnergy();
        health = health - 10;
        if (health < 0) {
            health = 0;
        }
        energy = energy - 10;
        if (energy < 0) {
            energy = 0;
        }
        lion.setHealth(health);
        lion.setEnergy(energy);
        checkEnergy(lion);
        System.out.println("The lion had to fight to show who is the real leader! Current health: " + lion.getHealth() + ". Current energy: " + lion.getEnergy());
    }

    private void hakunaMatata(Lion lion) {
        int energy = lion.getEnergy();
        energy = energy + 7;
        if (energy > 100) {
            energy = 100;
        }
        lion.setEnergy(energy);
        checkEnergy(lion);
        System.out.println("Hakuna matata! It was great to spend time with Timon and Pumba! The lion got energized! Current health: " + lion.getHealth() + ". Current energy: " + lion.getEnergy());
    }

    private boolean checkStatus(Lion lion) {
        if (lion.getHealth() <= 0) {
            return false;
        } else
            return true;
    }

    private void checkEnergy(Lion lion) {
        int health = lion.getHealth();
        if (lion.getEnergy() <= 0) {
            health = health - 5;

            if (health < 0) {
                health = 0;
            }
        }
        lion.setHealth(health);
        if (lion.getEnergy() == 0) {
            System.out.println("Seems like the lion needs some rest! Current health: " + lion.getHealth() + ". Current energy: " + lion.getEnergy());
        }
    }
}
