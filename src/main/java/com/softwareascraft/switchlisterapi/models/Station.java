package com.softwareascraft.switchlisterapi.models;

import java.util.List;

public class Station {
    private final String name;
    private final int maxNumberOfCars;
    private final List<String> currentCarsArray;

    public Station(String name, int maxNumberOfCars, List<String> currentCarsArray) {
        this.name = name;
        this.maxNumberOfCars = maxNumberOfCars;
        this.currentCarsArray = currentCarsArray;
    }

    public String Name() {
        return name;
    }

    public boolean needsCars() {
        return currentCarsArray.size() < maxNumberOfCars;
    }
}
