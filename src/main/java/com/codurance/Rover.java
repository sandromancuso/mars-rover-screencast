package com.codurance;

public class Rover {

    private String direction = "N";

    public String execute(String commands) {
        for (char c : commands.toCharArray()) {
            if (c == 'R') {
                turnRight();
            }
            if (c == 'L') {
                turnLeft();
            }
        }
        return "0-0-" + direction;
    }

    private void turnLeft() {
        if (direction == "N") {
            direction = "W";
        } else if (direction == "W") {
            direction = "S";
        } else if (direction == "S") {
            direction = "E";
        } else {
            direction = "N";
        }
    }

    private void turnRight() {
        if (direction == "N") {
            direction = "E";
        } else if (direction == "E") {
            direction = "S";
        } else if (direction == "S") {
            direction = "W";
        } else {
            direction = "N";
        }
    }
}
