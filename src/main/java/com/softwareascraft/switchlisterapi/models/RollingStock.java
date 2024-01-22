package com.softwareascraft.switchlisterapi.models;

public class RollingStock {
    public String markings;

    public RollingStock(String roadName, int roadNumber) {
        this.markings = "%s %d".formatted(roadName, roadNumber);
    }
}
