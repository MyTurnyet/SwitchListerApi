package com.softwareascraft.switchlisterapi.models;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@Tag("Unit")
public class StationTests {
    @Test
    void returnsStationName1() {
        final Station station = new Station("Name1", 0, Collections.emptyList());
        assertThat(station.Name()).isEqualTo("Name1");
    }

    @Test
    void returnsStationName2() {
        final Station station = new Station("Name2", 0, Collections.emptyList());
        assertThat(station.Name()).isEqualTo("Name2");
    }
    @Test
    void needsCars() {
        int maxNumberOfCars = 1;
        final List<String> currentCarsArray = Collections.emptyList();
        final Station station = new Station("Name1",maxNumberOfCars, currentCarsArray);
        final boolean needsCars = station.needsCars();
        assertThat(needsCars).isTrue();
    }
    @Test
    void doesNotNeedCars() {
        final List<String> currentCarsArray = List.of("BNSF 1234");
        final Station station = new Station("Name1", 1, currentCarsArray);
        final boolean needsCars = station.needsCars();
        assertThat(needsCars).isFalse();
    }
}