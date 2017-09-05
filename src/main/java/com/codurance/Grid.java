package com.codurance;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static com.codurance.Direction.*;

class Grid {
    private static final int MAX_HEIGHT = 10;
    private static final int MAX_WIDTH = 10;

    private List<Coordinate> obstacles = Collections.emptyList();

    Grid() {
    }

    Grid(List<Coordinate> obstacles) {
        this.obstacles = obstacles;
    }

    Optional<Coordinate> nextCoordinateFor(Coordinate coordinate, Direction direction) {
        int x = coordinate.x();
        int y = coordinate.y();

        if (direction == NORTH) {
            y = (y + 1) % MAX_HEIGHT;
        }
        if (direction == EAST) {
            x = (x + 1) % MAX_WIDTH;
        }
        if (direction == SOUTH) {
            y = (y > 0) ? y - 1 : MAX_HEIGHT - 1;
        }
        if (direction == WEST) {
            x = (x > 0) ? x - 1 : MAX_WIDTH - 1;
        }

        Coordinate newCoordinate = new Coordinate(x, y);

        return obstacles.contains(newCoordinate)
                        ? Optional.empty()
                        : Optional.of(newCoordinate);
    }
}
