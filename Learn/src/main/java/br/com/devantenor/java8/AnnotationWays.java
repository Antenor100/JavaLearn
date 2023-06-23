package br.com.devantenor.java8;

import br.com.devantenor.java8.utils.TestAnnotationJava8;

public class AnnotationWays {
    public static void tests() {
        System.out.println("The java annotations are since java 5, with: ");

        System.out.println("@Override");
        System.out.println("@Deprecated");
        System.out.println("@SuppressWarning");

        System.out.println("Always utilized in declarations. Examples available in the " +
                "class br.com.devantenor.java8.utils.TestAnnotationJava5");

        System.out.println("In java 8 are implemented a many of places for use Annotations, see examples in the " +
                "class br.com.devantenor.java8.utils.TestAnnotationJava8");

        TestAnnotationJava8.printClassAnnotationMessages();
    }
}
