package br.com.devantenor.java8.model.figures;

import br.com.devantenor.java8.interfaces.Figure;

public class Rectangle implements Figure {
    private double width;
    private double  height;

    public String getFigureType() {
        return "Rectangle";
    }

    public void writeRandomNumber (int randomNumber) {
        System.out.println("Rectangle class random number method: " + randomNumber);
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
