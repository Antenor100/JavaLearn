package br.com.devantenor.java8.interfaces;

public interface Figure {
    default Drawable printDimensionsAndDrawAction(Drawable d) {
        int randomNumber = (int) (Math.random() * 100000);
        System.out.println(getFigureType() + " class -> Width: " + getWidth() + ", Height: " + getHeight());
        d.drawAction(randomNumber);
        return d;
    };

    default void printFigurePixels() {
        System.out.println("The total of figure pixels is " + (getWidth() * getHeight()));
    }
    
    String getFigureType();

    double getWidth();
    void setWidth(double width);

    double getHeight();
    void setHeight(double height);
}
