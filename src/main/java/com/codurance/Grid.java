package com.codurance;

import static com.codurance.Direction.*;

class Grid {
    private final int maxHeight;
    private final int maxLength;

    Grid(int maxHeight, int maxLength) {
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
    }

    Coordinate nextCellPosition(Coordinate coordinate, Direction direction) {
        int y = coordinate.y();
        int x = coordinate.x();
        if (direction == NORTH) {
            y = (y + 1) % maxHeight;
        } else if (direction == SOUTH){
            y = (y == 0) ? maxHeight - 1 : y - 1;
        } else if (direction == EAST) {
            x = (x + 1) % maxLength;
        } else if (direction == WEST) {
            x = (x == 0) ? maxLength - 1 : x - 1;
        }
        return new Coordinate(x, y);
    }
}
