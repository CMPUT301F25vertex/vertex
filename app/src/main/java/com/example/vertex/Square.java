package com.example.vertex;

public class Square extends Shape {
    private int sideLength;

    public Square(int sideLength, int x, int y) {
        super(x, y);

        this.sideLength = sideLength;
    }
}
