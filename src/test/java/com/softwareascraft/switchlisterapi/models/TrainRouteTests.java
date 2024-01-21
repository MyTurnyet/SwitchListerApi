package com.softwareascraft.switchlisterapi.models;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


@Tag("Unit")
public class TrainRouteTests {
    @Test
    void should_returnRouteName() {
        final TrainRoute trainRoute = new TrainRoute();
        final String name = trainRoute.Name();
        assertThat(name).isEqualTo("train-1234");
    }
}