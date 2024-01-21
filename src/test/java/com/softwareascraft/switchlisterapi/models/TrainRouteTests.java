package com.softwareascraft.switchlisterapi.models;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


@Tag("Unit")
public class TrainRouteTests {
    @Test
    void should_returnRouteName_train_1234() {
        final TrainRoute trainRoute = new TrainRoute("train-1234", new String[0]);
        final String name = trainRoute.Name();
        assertThat(name).isEqualTo("train-1234");
    }
    @Test
    void returnRouteName_express_2345() {
        final TrainRoute trainRoute = new TrainRoute("express-2345", new String[0]);
        final String name = trainRoute.Name();
        assertThat(name).isEqualTo("express-2345");
    }
    @Test
    void returnsNoStationNames() {
                final TrainRoute trainRoute = new TrainRoute("express-2345", new String[0]);
        final String[] stations = trainRoute.Stations();
        assertThat(stations).isEmpty();
    }
    @Test
    void returnsOneStationName() {
        String[] stationNames = {"Train Station 1"};
                final TrainRoute trainRoute = new TrainRoute("express-2345", stationNames);
        final String[] stations = trainRoute.Stations();
        assertThat(stations).containsOnly("Train Station 1");
    }
}