package br.com.devantenor.java8.model.store;

import java.lang.reflect.Field;

public class Product {
    private String name;
    private Double price;

    public Product (String name, double price) {
        this.name = name;
        this.price = price;
    }

    //TODO Make a example for convert a data with a diamond operator like de Dados.<Long>get("teste de dado")
//    public <T> get(String attributeName) {
//        try {
//            Class productClass = this.getClass();
//
//            Field targetField = productClass.getDeclaredField(attributeName);
//            targetField.setAccessible(true);
//
//            <T> targetField.get(this);
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
