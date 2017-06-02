package com.codurance;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class RoverShould {

    private Rover rover;

    @Before
    public void initialise() {
        rover = new Rover();
    }

    @Test
    @Parameters({
            "R, 0-0-E",
            "RR, 0-0-S",
            "RRR, 0-0-W",
            "RRRR, 0-0-N"
    })
    public void
    turn_right(String command, String position) {
        assertThat(rover.execute(command), is(position));
    }

    @Test
    @Parameters({
            "L, 0-0-W",
            "LL, 0-0-S",
            "LLL, 0-0-E",
            "LLLL, 0-0-N"
    })
    public void
    turn_left(String command, String position) {
        assertThat(rover.execute(command), is(position));
    }
}
