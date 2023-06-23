package br.com.devantenor.java8;

import br.com.devantenor.java8.model.figures.Rectangle;
import br.com.devantenor.java8.model.figures.Triangle;
import br.com.devantenor.java8.interfaces.Drawable;
import br.com.devantenor.java8.interfaces.Figure;
import br.com.devantenor.java8.utils.PrintUtils;

import java.util.ArrayList;
import java.util.List;

public class MethodReferences {
    public static void tests () {
        //Sem Method Reference (Com lambda expression)
        Drawable fig1 = (randomNumber) -> System.out.println("Lambda expression random number: " + randomNumber);
        fig1.drawAction((int) (Math.random() * 1000));

        Rectangle rec1 = new Rectangle();
        rec1.setWidth(1000);
        rec1.setHeight(800);

        //Com método do próprio objeto (Method Reference)
        Drawable fig2 = rec1::writeRandomNumber;
        fig2.drawAction((int) (Math.random() * 1000));

        List<Figure> figureList = new ArrayList<>();

        Figure fig3 = new Triangle();
        fig3.setWidth(500);
        fig3.setHeight(200);
        figureList.add(fig3);

        Figure fig4 = new Triangle();
        fig4.setWidth(550);
        fig4.setHeight(250);
        figureList.add(fig4);

        //Com método de instância de um tipo especifico (Lista de Figure, imprime com método de Figure) (Method Reference)
        figureList.forEach(Figure::printFigurePixels);

        //Com construtor (Method Reference)
        Drawable fig5 = Triangle::new;
        fig5.drawAction((int) (Math.random() * 1000));

        //Com método de uma classe estática (Method Reference)
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.forEach(PrintUtils::printInt);
    }
}
