package com.codurance;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RoverShould {

    @Test public void
    rotate_right() {
        Rover rover = new Rover();

        assertThat(rover.execute("R"), is("0:0:E"));
    }
}
