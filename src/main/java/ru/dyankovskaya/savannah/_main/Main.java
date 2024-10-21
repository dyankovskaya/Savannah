package ru.dyankovskaya.savannah._main;

import ru.dyankovskaya.savannah.entity.Lion;
import ru.dyankovskaya.savannah.util.EventSimulator;

public class Main {

    public static void main(String[] args) {
        Lion lion = new Lion();
        EventSimulator eventSimulator = new EventSimulator();
        eventSimulator.startSimulation(lion);
    }
}