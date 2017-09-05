package com.codurance;

import java.util.Optional;

import static com.codurance.Direction.*;

class Rover {

    private Grid grid;
    
    Coordinate coordinate = new Coordinate(0, 0);
    Direction direction = NORTH;

    public Rover(Grid grid) {
        this.grid = grid;
    }

    String execute(String commands) {
        String obstacleString = "";
        for (char c : commands.toCharArray()) {
            if (c == 'R') {
                direction = direction.right();
            }
            if (c == 'L') {
                direction = direction.left();
            }
            if (c == 'M') {
                obstacleString = move();
            }
        }
        return obstacleString + coordinate.x() + ":" + coordinate.y() + ":" + direction.value();
    }

    private String move() {
        Optional<Coordinate> nextCoordinate = grid.nextCoordinateFor(this.coordinate, direction);
        nextCoordinate.ifPresent(nc -> this.coordinate = nc);
        return nextCoordinate.isPresent() ? "" : "O:";
    }

}
