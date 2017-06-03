package com.codurance;

import static com.codurance.Direction.*;

class Grid {
    private final int maxHeigh;
    private final int maxLenght;

    Grid(int maxHeigh, int maxLenght) {
        this.maxHeigh = maxHeigh;
        this.maxLenght = maxLenght;
    }

    Coordinate nextCellPosition(Coordinate coordinate, Direction direction) {
        int y = coordinate.y();
        int x = coordinate.x();
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
