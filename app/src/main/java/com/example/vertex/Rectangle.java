package com.example.vertex;

public class Rectangle extends Shape {
    private int length;
    private int width;
    public Rectangle(int length, int width, int x, int y) {
        super(x, y);
        
        this.length = length;
        this.width = width;
    }
}
