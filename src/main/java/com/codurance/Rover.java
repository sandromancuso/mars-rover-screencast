package com.codurance;

import static com.codurance.Direction.NORTH;

class Rover {

    public static final int MAX_HEIGHT = 10;
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
        int y = coordinate.y();

        if (direction == NORTH) {
            y = (y + 1) % MAX_HEIGHT;
        }

        return new Coordinate(coordinate.x(), y);
    }

}
