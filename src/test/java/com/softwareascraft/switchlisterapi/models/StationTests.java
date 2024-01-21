package com.softwareascraft.switchlisterapi.models;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


@Tag("Unit")
public class StationTests {
    @Test
    void returnsStationName1() {
        final Station station = new Station("Name1");
        assertThat(station.Name()).isEqualTo("Name1");
    }

    @Test
    void returnsStationName2() {
        final Station station = new Station("Name2");
        assertThat(station.Name()).isEqualTo("Name2");
    }
}