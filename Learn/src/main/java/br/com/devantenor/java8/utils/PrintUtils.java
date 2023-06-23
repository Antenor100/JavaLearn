package br.com.devantenor.java8.utils;

import br.com.devantenor.java8.model.store.Product;

import java.util.List;

public class PrintUtils {
    public static void printInt(int number) {
        System.out.println("Print a int number with PrintUtils, number: " + number);
    }

    public static void printProductsName(List<Product> products) {
        if (products.isEmpty()) {
            System.out.println("Empty list");
        } else {
            products.forEach(product -> System.out.println(product.getName()));
        }
    }
}
