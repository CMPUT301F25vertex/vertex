package com.example.vertex;

public class Pentagon extends Shape {
    private int sideLength;

    public Pentagon(int sideLength, int x, int y) {
        super(x, y);

        this.sideLength = sideLength;
    }
}
