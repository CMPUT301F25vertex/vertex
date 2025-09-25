package com.example.vertex;

abstract public class Shape {
    private int x;
    private int y;
    private String color = "red";

    private String colour = "yellow";

    public Shape(int x, int y, String colour) {
        this.x = x;
        this.y = y;
        this.colour = colour;
    }
}
