package com.codurance;

import static com.codurance.Direction.EAST;
import static com.codurance.Direction.NORTH;

class Rover {

    private static final int MAX_HEIGHT = 10;
    private static final int MAX_WIDTH = 10;

    Direction direction = NORTH;
    Coordinate coordinate = new Coordinate(0, 0);

    String execute(String commands) {
        for (char c : commands.toCharArray()) {
            if (c == 'R') {
                direction = direction.right();
            }
            if (c == 'L') {
                direction = direction.left();
            }
            if (c == 'M') {
                coordinate = move();
            }
        }
        return coordinate.x() + ":" + coordinate.y() + ":" + direction.value();
    }

    private Coordinate move() {
        int x = coordinate.x();
        int y = coordinate.y();

        if (direction == NORTH) {
            y = (y + 1) % MAX_HEIGHT;
        }
        if (direction == EAST) {
            x = (x + 1) % MAX_WIDTH;
        }

        return new Coordinate(x, y);
    }

}
