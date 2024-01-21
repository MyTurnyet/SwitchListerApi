package com.softwareascraft.switchlisterapi.controllers;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


@Tag("Unit")
public class SwitchlistControllerTests {
    @Test
    void should_returnSimpleSwitchlist() {
        final SwitchlistController controller = new SwitchlistController();
        final String switchList = controller.getSwitchList();

        assertThat(switchList).isEqualTo("");
    }
}
