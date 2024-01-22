package com.softwareascraft.switchlisterapi.models;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


@Tag("Unit")
public class IndustryTests {
    @Test
    void shouldReturnName() {
        final Industry industry = new Industry("Test Industry");
        final String name = industry.Name();
        assertThat(name).isEqualTo("Test Industry");
    }
}