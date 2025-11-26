package com.appium.utils;

/**
 * @author abhishekkumarjain
 */
public enum DirectionType {
    UP("up"),
    DOWN("down"),
    LEFT("left"),
    RIGHT("right");

    private String direction;

    DirectionType(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
}
