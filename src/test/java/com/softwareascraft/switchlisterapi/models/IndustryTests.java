package com.softwareascraft.switchlisterapi.models;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@Tag("Unit")
public class IndustryTests {
    @Test
    void shouldReturnName() {
        final Industry industry = new Industry("Test Industry", 0, Collections.emptyList());
        final String name = industry.name;
        assertThat(name).isEqualTo("Test Industry");
    }

    @Test
    void doesNotNeedCars() {
        int maxCars = 0;
        final Industry industry = new Industry("Test 1", maxCars, Collections.emptyList());
        assertThat(industry.needsCars()).isFalse();
    }

    @Test
    void needsCarsWhenItHasNone() {
        int maxCars = 1;
        final Industry industry = new Industry("Test 1", maxCars, Collections.emptyList());
        assertThat(industry.needsCars()).isTrue();
    }
    @Test
    void DoesNotCarsWhenItHasOne() {
        int maxCars = 1;
        final List<RollingStock> existingCarList = List.of(new RollingStock("BNSF", 1234));
        final Industry industry = new Industry("Test 1", maxCars, existingCarList);
        assertThat(industry.needsCars()).isFalse();
    }
}