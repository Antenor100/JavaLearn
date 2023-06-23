package br.com.devantenor.java8;

import br.com.devantenor.java8.model.figures.Rectangle;
import br.com.devantenor.java8.model.figures.Triangle;
import br.com.devantenor.java8.interfaces.Drawable;
import br.com.devantenor.java8.interfaces.Figure;

import java.util.ArrayList;
import java.util.List;

/**
 * É possivel ver uma implementação bem parecida olhando a hierarquia da interface List
 * e sua classe de implementação ArrayList
 */
public class LambdaExpressions {
    public static void tests () {
        Figure rec1 = new Rectangle();
        rec1.setWidth(800);
        rec1.setHeight(600);

        rec1.printDimensionsAndDrawAction(
            // Uso de interface funcional sem lambda expression e com classe anônima
            new Drawable() {
                @Override
                public void drawAction(int number) {
                    System.out.println("Rec1 draw action! -> " + (number / 2));
                }
            }
        );

        Figure tri1 = new Triangle();
        tri1.setWidth(700);
        tri1.setHeight(500);
        // Uso de interface funcional com lambda expression
        tri1.printDimensionsAndDrawAction((randomNumber) -> System.out.println("Tri1 draw action! -> " + randomNumber / 3));

        Figure tri2 = new Triangle();
        tri2.setWidth(400);
        tri2.setHeight(300);
        // Uso de interface funcional com lambda expression
        tri2.printDimensionsAndDrawAction((randomNumber) -> {
            System.out.println("Tri2 draw action! -> " + randomNumber / 4);
            System.out.println("Testing with 2 argument lines");
        });

        // Exemplo de uso normal
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.forEach((item) -> System.out.println("Printing list with ArrayList foreach, item: " + item));
    }
}