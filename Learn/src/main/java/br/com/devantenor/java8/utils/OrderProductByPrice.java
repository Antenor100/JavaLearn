package br.com.devantenor.java8.utils;

import br.com.devantenor.java8.model.store.Product;

import java.util.Comparator;

public class OrderProductByPrice implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getPrice().compareTo(p2.getPrice());
    }
}
