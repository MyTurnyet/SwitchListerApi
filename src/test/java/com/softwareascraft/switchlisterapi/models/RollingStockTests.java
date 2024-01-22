package com.softwareascraft.switchlisterapi.models;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


@Tag("Unit")
public class RollingStockTests {
    @Test
    void returnMarkings() {
        final RollingStock rollingStock = new RollingStock("BNSF", 1234);
        final String markings = rollingStock.markings;
        assertThat(markings).isEqualTo("BNSF 1234");
    }
}