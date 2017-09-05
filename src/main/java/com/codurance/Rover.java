package com.codurance;

import static com.codurance.Direction.*;

class Rover {

    private Grid grid;
    
    Coordinate coordinate = new Coordinate(0, 0);
    Direction direction = NORTH;

    public Rover(Grid grid) {
        this.grid = grid;
    }

    String execute(String commands) {
        for (char c : commands.toCharArray()) {
            if (c == 'R') {
                direction = direction.right();
            }
            if (c == 'L') {
                direction = direction.left();
            }
            if (c == 'M') {
                coordinate = grid.nextCoordinateFor(coordinate, direction);
            }
        }
        return coordinate.x() + ":" + coordinate.y() + ":" + direction.value();
    }

}
