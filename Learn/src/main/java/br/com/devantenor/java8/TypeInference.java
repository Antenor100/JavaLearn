package br.com.devantenor.java8;

import br.com.devantenor.java8.model.store.Product;
import br.com.devantenor.java8.utils.PrintUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TypeInference {
    public static void tests() {
        System.out.println("Now java can infer the data type for outher parts of code:");

        List products = new ArrayList();
        products.add(new Product("Televisão", 200));

        PrintUtils.printProductsName(products);

        System.out.println("We can see in that code which the list dont have a type with diamonds " +
                "operators, but ,the called method has. In this form java can understand the type");

    }
}
