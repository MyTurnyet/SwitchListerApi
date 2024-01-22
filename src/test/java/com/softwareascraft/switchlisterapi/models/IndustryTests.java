package com.softwareascraft.switchlisterapi.models;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


@Tag("Unit")
public class IndustryTests {
    @Test
    void shouldReturnName() {
        final Industry industry = new Industry("Test Industry", 0);
        final String name = industry.Name;
        assertThat(name).isEqualTo("Test Industry");
    }

    @Test
    void doesNotNeedCars() {
        int maxCars = 0;
        final Industry industry = new Industry("Test 1", maxCars);
        assertThat(industry.needsCars()).isFalse();
    }

    @Test
    void needsCarsWhenItHasNone() {
        int maxCars = 1;
        final Industry industry = new Industry("Test 1", maxCars);
        assertThat(industry.needsCars()).isTrue();
    }
//    @Test
//    void DoesNotCarsWhenItHasOne() {
//        int maxCars = 1;
//        final Industry industry = new Industry("Test 1", maxCars);
//        assertThat(industry.needsCars()).isTrue();
//    }
}