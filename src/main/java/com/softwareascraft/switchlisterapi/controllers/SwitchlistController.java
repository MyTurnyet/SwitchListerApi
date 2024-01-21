package com.softwareascraft.switchlisterapi.controllers;

public class SwitchlistController {
    public String getSwitchListFor(String trainName) {
        return new StringBuilder()
                .append("Train ").append(trainName)
                .append("\n").append("\n")
                .append("Town1\n")
                .append("---------\n").append("\n")
                .append("* Grain Elevator *\n")
                .append("pickup\tBNSF 1234\n")
                .append("set out\tCPR 9876")
                .toString();
    }
}
