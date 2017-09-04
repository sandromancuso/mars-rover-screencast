package com.codurance;

import static com.codurance.Direction.*;

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
        if (direction == SOUTH) {
            y = (y > 0) ? y - 1 : MAX_HEIGHT - 1;
        }
        if (direction == WEST) {
            x = (x > 0) ? x - 1 : MAX_WIDTH - 1;
        }

        return new Coordinate(x, y);
    }

}
