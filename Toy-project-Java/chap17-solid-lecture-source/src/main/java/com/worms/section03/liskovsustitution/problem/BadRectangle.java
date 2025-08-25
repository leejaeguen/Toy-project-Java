package com.worms.section03.liskovsustitution.problem;

public class BadRectangle {
    private int width;
    private int height;

    public void BadRectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getArea() {return width * height;}
}
