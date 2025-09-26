package com.example.vertex;

public class Triangle extends Shape {
    private int sideLength;

    public Triangle(int sideLength, int x, int y) {
        super(x, y);

        this.sideLength = sideLength;
    }
}