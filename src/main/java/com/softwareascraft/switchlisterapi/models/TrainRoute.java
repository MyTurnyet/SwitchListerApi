package com.softwareascraft.switchlisterapi.models;

import java.util.List;

public class TrainRoute {
    private final String name;
    private final List<Station> stationNames;

    public TrainRoute(String name, List<Station> stationNames) {
        this.name = name;
        this.stationNames = stationNames;
    }

    public String Name() {
        return name;
    }

    public List<Station> Stations() {
            return stationNames;
    }
}
