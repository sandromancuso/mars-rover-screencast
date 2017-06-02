package com.codurance;

public enum Direction {
    NORTH("N", "W", "E"),
    EAST("E", "N", "S"),
    SOUTH("S", "E", "W"),
    WEST("W", "S", "N");

    private final String current;
    private final String left;
    private final String right;

    Direction(String current, String left, String right) {
        this.current = current;
        this.left = left;
        this.right = right;
    }

    public Direction right() {
        return directionMatching(this.right);
    }

    public Direction left() {
        return directionMatching(left);
    }

    public String stringValue() {
        return current;
    }

    private Direction directionMatching(String value) {
        for (Direction direction : values()) {
            if (direction.current == value) {
                return direction;
            }
        }
        return null;
    }
}
