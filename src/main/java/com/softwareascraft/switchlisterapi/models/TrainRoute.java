package com.softwareascraft.switchlisterapi.models;

import java.util.List;

public class TrainRoute {
    public final String name;
    private final List<Station> stationNames;

    public TrainRoute(String name, List<Station> stationNames) {
        this.name = name;
        this.stationNames = stationNames;
    }

    public List<Station> Stations() {
            return stationNames;
    }
}
