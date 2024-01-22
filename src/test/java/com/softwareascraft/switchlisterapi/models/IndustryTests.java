package com.softwareascraft.switchlisterapi.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@Tag("Unit")
public class IndustryTests {
    int maxCars = 1;
    Industry industry;
    final RollingStock bnsfCar = new RollingStock("BNSF", 1234);

    @BeforeEach
    void setup(){
        industry = new Industry("Test 1", maxCars, new ArrayList<RollingStock>());
    }
    @Test
    void shouldReturnName() {
        final String name = industry.name;
        assertThat(name).isEqualTo("Test 1");
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
        final List<RollingStock> list = List.of(bnsfCar);
        final Industry industry = new Industry("Test 1", maxCars, list);
        assertThat(industry.needsCars()).isFalse();
    }
    @Test
    void spotsACarAtIndustry() {
        industry.spotCar(bnsfCar);
        assertThat(industry.needsCars()).isFalse();
    }
}