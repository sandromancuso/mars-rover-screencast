package com.codurance;

class Rover {

    String direction = "N";

    String execute(String commands) {
        for (char c : commands.toCharArray()) {
            direction = rotateRight();
        }
        return "0:0:" + direction;
    }

    private String rotateRight() {
        if (direction == "N") {
            return "E";
        } else if (direction == "E") {
            return "S";
        } if (direction == "S") {
            return "W";
        } else {
            return "N";
        }
    }
}
