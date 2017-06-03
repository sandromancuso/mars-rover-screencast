package com.codurance;

import static com.codurance.Direction.*;

class Rover {

    private Direction direction = NORTH;
    private Coordinate coordinate = new Coordinate(0, 0);

    String execute(String commands) {
        for (char c : commands.toCharArray()) {
            if (c == 'R') {
                direction = direction.right();
            }
            if (c == 'L') {
                direction = direction.left();
            }
            if (c == 'M') {
                coordinate = coordinate.move(direction, this);
            }
        }
        return coordinate.x() + "-" + coordinate.y() + "-" + direction.stringValue();
    }

}
