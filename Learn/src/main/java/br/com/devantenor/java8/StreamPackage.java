package br.com.devantenor.java8;

import br.com.devantenor.java8.model.store.Product;
import br.com.devantenor.java8.utils.OrderProductByPrice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamPackage {
    public static void tests() {
        List<Product> products = new ArrayList();
        products.add(new Product("Geladeira 520L", 2600));
        products.add(new Product("Televisão", 1670.30));
        products.add(new Product("Cama", 1000));
        products.add(new Product("Geladeira 320L", 2000));
        products.add(new Product("Micro-ondas", 1670.30));
        products.add(new Product("Geladeira 410L", 2130));

        //Supondo que precisamos filtrar as geladeiras, ordenar por preço e printar os nomes em uppercase no console:

        System.out.println("Maneira antiga");

        List<Product>  refrigerators = new ArrayList();
        for (Product product : products) {
            if (product.getName().toLowerCase().contains("geladeira")) refrigerators.add(product);
        }

        Collections.sort(refrigerators, new OrderProductByPrice());

        for (Product product : refrigerators) {
            System.out.println(product.getName().toUpperCase());
        }

        System.out.println("\nManeira com pipeline método stream de Collections");

        products.stream()
            .filter(p -> p.getName().toLowerCase().contains("geladeira"))
            .sorted(Comparator.comparing(Product::getPrice))
            .map(p -> p.getName().toUpperCase())
            .forEach(System.out::println);
    }
}