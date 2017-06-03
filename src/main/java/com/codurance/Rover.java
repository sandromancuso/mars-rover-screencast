package com.codurance;

import static com.codurance.Direction.*;

public class Rover {

    private Direction direction = NORTH;
    private int y = 0;
    private int x = 0;

    public String execute(String commands) {
        for (char c : commands.toCharArray()) {
            if (c == 'R') {
                direction = direction.right();
            }
            if (c == 'L') {
                direction = direction.left();
            }
            if (c == 'M') {
                move();
            }
        }
        return x + "-" + y + "-" + direction.stringValue();
    }

    private int move() {
        if (direction == NORTH) {
            y += 1;
        } else if (direction == SOUTH){
            y -= 1;
        } else if (direction == EAST) {
            x += 1;
        } else if (direction == WEST) {
            x -= 1;
        }
        return y;
    }

}
