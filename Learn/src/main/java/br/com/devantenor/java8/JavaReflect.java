package br.com.devantenor.java8;

import br.com.devantenor.java8.model.figures.Rectangle;
import br.com.devantenor.java8.model.store.Product;
import br.com.devantenor.java8.utils.PrintUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaReflect {
    public static void tests() {
        Rectangle rec = new Rectangle();

        Class rectangleClass = rec.getClass();

        System.out.println("Testing java.lang.reflect on class Rectangle");
        System.out.println("");

        System.out.println("Full class Name: " + rectangleClass.getName());

        System.out.println("");
        System.out.println("Constructors:");
        Arrays.stream(rectangleClass.getConstructors())
                .forEach(constructor -> System.out.println(constructor));

        System.out.println("");
        System.out.println("Methods:");
        Arrays.stream(rectangleClass.getDeclaredMethods())
                .forEach(method -> {
                    System.out.print(method.getName() + " -> Parameters: ");

                    Arrays.stream(method.getParameters())
                            .forEach(parameter -> System.out.print(parameter.getName() + "(" + parameter.getType() + ")"));

                    System.out.println("");
                });

        System.out.println("");
        System.out.println("Attributes:");
        Arrays.stream(rectangleClass.getDeclaredFields())
                .forEach(field -> System.out.println(field.getName()));

    }
}
