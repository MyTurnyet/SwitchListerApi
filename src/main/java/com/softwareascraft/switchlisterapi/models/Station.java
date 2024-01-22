package com.softwareascraft.switchlisterapi.models;

import java.util.List;

public class Station {
    public final String Name;
    private final int maxNumberOfCars;
    private final List<String> currentCarsArray;

    public Station(String name, int maxNumberOfCars, List<String> currentCarsArray) {
        this.Name = name;
        this.maxNumberOfCars = maxNumberOfCars;
        this.currentCarsArray = currentCarsArray;
    }


    public boolean needsCars() {
        return currentCarsArray.size() < maxNumberOfCars;
    }
}
