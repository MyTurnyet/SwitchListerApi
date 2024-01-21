package com.softwareascraft.switchlisterapi.models;

public class TrainRoute {
    private final String name;

    public TrainRoute(String name) {

        this.name = name;
    }

    public String Name() {
        return name;
    }

    public String[] Stations() {
            return new String[0];
    }
}
