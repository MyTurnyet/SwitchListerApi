package com.softwareascraft.switchlisterapi.models;

import java.util.List;

public class Industry {

    public final String name;
    private final int maxCars;
    private final List<RollingStock> carsAtIndustry;

    public Industry(String name, int maxCars, List<RollingStock> existingCarList) {
        this.name = name;
        this.maxCars = maxCars;
        this.carsAtIndustry = existingCarList;
    }


    public boolean needsCars() {
        return maxCars > carsAtIndustry.size();
    }
}
