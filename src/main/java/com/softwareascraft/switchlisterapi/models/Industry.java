package com.softwareascraft.switchlisterapi.models;

public class Industry {

    public final String name;
    private final int maxCars;

    public Industry(String name, int maxCars) {
        this.name = name;
        this.maxCars = maxCars;
    }


    public boolean needsCars() {
        return maxCars > 0;
    }
}
