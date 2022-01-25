package com.company;

public class Node {
    private String colour;
    private Integer up;
    private Integer down;
    private Integer left;
    private Integer right;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Integer getUp() {
        return up;
    }

    public void setUp(Integer up) {
        this.up = up;
    }

    public Integer getDown() {
        return down;
    }

    public void setDown(Integer down) {
        this.down = down;
    }

    public Integer getLeft() {
        return left;
    }

    public void setLeft(Integer left) {
        this.left = left;
    }

    public Integer getRight() {
        return right;
    }

    public void setRight(Integer right) {
        this.right = right;
    }
}
