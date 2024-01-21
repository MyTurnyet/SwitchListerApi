package com.softwareascraft.switchlisterapi.controllers;

public class SwitchlistController {
    public String getSwitchList() {
        return "Train 1234-Local\n" +
                "\n" +
                "Town1\n" +
                "---------\n" +
                "\n" +
                "* Grain Elevator *\n" +
                "pickup\tBNSF 1234\n" +
                "set out\tCPR 9876";
    }
}
