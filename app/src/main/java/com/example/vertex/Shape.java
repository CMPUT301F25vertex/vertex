package com.example.vertex;

abstract public class Shape {
    private int x;
    private int y;
    private String color = "red";

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
}
