package com.softwareascraft.switchlisterapi.models;

public class RollingStock {
    private final String roadName;
    private final int roadNumber;
    public String markings;

    public RollingStock(String roadName, int roadNumber) {
        this.roadName = roadName;
        this.roadNumber = roadNumber;
        this.markings = "%s %d".formatted(roadName, roadNumber);
    }
}
