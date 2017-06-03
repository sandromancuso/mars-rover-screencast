package com.codurance;

import org.junit.Test;

import java.util.List;

import static java.util.Collections.singletonList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GridShould {

    private Grid grid = new Grid(10, 10);

    @Test public void
    return_same_coordinate_when_next_cell_has_obstable() {
        List<Coordinate> obstacles = singletonList(new Coordinate(1, 2));
        grid = new Grid(10, 10, obstacles);
        Coordinate position = new Coordinate(1, 1);
        Direction direction = Direction.NORTH;

        assertThat(grid.nextCellPosition(position, direction), is(position));
    }

}