package com.softwareascraft.switchlisterapi.models;

public class TrainRoute {
    private final String name;
    private final String[] stationNames;

    public TrainRoute(String name, String[] stationNames) {
        this.name = name;
        this.stationNames = stationNames;
    }

    public String Name() {
        return name;
    }

    public String[] Stations() {
            return stationNames;
    }
}
