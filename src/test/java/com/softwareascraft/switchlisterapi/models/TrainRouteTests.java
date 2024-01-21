package com.softwareascraft.switchlisterapi.models;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@Tag("Unit")
public class TrainRouteTests {
    @Test
    void should_returnRouteName_train_1234() {
        final TrainRoute trainRoute = new TrainRoute("train-1234", Collections.emptyList());
        final String name = trainRoute.Name();
        assertThat(name).isEqualTo("train-1234");
    }

    @Test
    void returnRouteName_express_2345() {
        final TrainRoute trainRoute = new TrainRoute("express-2345", Collections.emptyList());
        final String name = trainRoute.Name();
        assertThat(name).isEqualTo("express-2345");
    }

    @Test
    void returnsNoStations() {
        final TrainRoute trainRoute = new TrainRoute("express-2345", Collections.emptyList());
        final List<Station> stations = trainRoute.Stations();
        assertThat(stations).isEmpty();
    }

    @Test
    void returnsOneStation() {

        List<Station> stationNames = List.of(new Station("Train Station 1"));
        final TrainRoute trainRoute = new TrainRoute("express-2345", stationNames);
        final List<Station> stations = trainRoute.Stations();
        assertThat(stations).hasSize(1);
        assertThat(stations.get(0)).isEqualTo(stationNames.get(0));
    }
}