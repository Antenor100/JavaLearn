package br.com.devantenor.java8.model.figures;

import br.com.devantenor.java8.interfaces.Figure;

public class Triangle implements Figure {
    public Triangle() {}

    public Triangle (int initialRandomNumber) {
        this.initialRandomNumber = initialRandomNumber;
        System.out.println("Initial random number using Triangle Constructor, number: " + this.initialRandomNumber);
    }

    private int initialRandomNumber;
    private double width;
    private double  height;

    public String getFigureType() {
        return "Triangle";
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
