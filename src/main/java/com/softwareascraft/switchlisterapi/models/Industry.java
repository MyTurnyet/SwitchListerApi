package com.softwareascraft.switchlisterapi.models;

public class Industry {

    public final String Name;
    private final int maxCars;

    public Industry(String name, int maxCars) {
        this.Name = name;
        this.maxCars = maxCars;
    }


    public boolean needsCars() {
        return maxCars > 0;
    }
}
