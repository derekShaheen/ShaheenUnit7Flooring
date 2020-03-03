package com.shaheen.shaheenunit7flooring;

public class Calculation {
    private double length = 0.0;
    private double width = 0.0;

    public Calculation() {
    }

    public double getResult() {
        return length * width;
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
