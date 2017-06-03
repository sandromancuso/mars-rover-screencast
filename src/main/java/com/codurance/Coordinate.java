package com.codurance;

import static com.codurance.Direction.*;

class Coordinate {
    private final int x;
    private final int y;

    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int y() {
        return y;
    }

    int x() {
        return x;
    }

    Coordinate move(Direction direction, Rover rover) {
        int y = y();
        int x = x();
        if (direction == NORTH) {
            y = (y + 1) % 10;
        } else if (direction == SOUTH){
            y = (y == 0) ? 9 : y - 1;
        } else if (direction == EAST) {
            x = (x + 1) % 10;
        } else if (direction == WEST) {
            x = (x == 0) ? 9 : x - 1;
        }
        return new Coordinate(x, y);
    }
}
