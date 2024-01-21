package com.softwareascraft.switchlisterapi.controllers;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


@Tag("Unit")
public class SwitchlistControllerTests {
    @Test
    void should_returnSwitchlistForTrain1234_Local() {
        final SwitchlistController controller = new SwitchlistController();
        final String switchList = controller.getSwitchListFor("1234-Local");

        assertThat(switchList).isEqualTo(
                "Train 1234-Local\n" +
                "\n" +
                "Town1\n" +
                "---------\n" +
                "\n" +
                "* Grain Elevator *\n" +
                "pickup\tBNSF 1234\n" +
                "set out\tCPR 9876");
    }
    @Test
    void should_returnSimpleSwitchlist() {
        final SwitchlistController controller = new SwitchlistController();
        final String switchList = controller.getSwitchListFor("2345-Express");

        assertThat(switchList).isEqualTo(
                "Train 2345-Express\n" +
                "\n" +
                "Town1\n" +
                "---------\n" +
                "\n" +
                "* Grain Elevator *\n" +
                "pickup\tBNSF 1234\n" +
                "set out\tCPR 9876");
    }
}
