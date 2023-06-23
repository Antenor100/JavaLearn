package br.com.devantenor;

import br.com.devantenor.java8.*;
import br.com.devantenor.java9.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n\n########### JAVA 8 ###########");

        System.out.println("\n## Test " + LambdaExpressions.class.getSimpleName() + " ##");
        LambdaExpressions.tests();

        System.out.println("\n## Test " + MethodReferences.class.getSimpleName() + " ##");
        MethodReferences.tests();

        System.out.println("\n## Test " + StreamPackage.class.getSimpleName() + " ##");
        StreamPackage.tests();

        System.out.println("\n## Test " + Base64.class.getSimpleName() + " ##");
        Base64.tests();

        System.out.println("\n## Test " + StringJoiner.class.getSimpleName() + " ##");
        StringJoiner.tests();

        System.out.println("\n## Test " + Optional.class.getSimpleName() + " ##");
        Optional.tests();

        System.out.println("\n## Test " + JavaNashorn.class.getSimpleName() + " ##");
        JavaNashorn.tests();

        System.out.println("\n## Test " + ArrayParallelSorting.class.getSimpleName() + " ##");
        ArrayParallelSorting.tests();

        System.out.println("\n## Test " + TypeInference.class.getSimpleName() + " ##");
        TypeInference.tests();

        System.out.println("\n## Test " + JavaReflect.class.getSimpleName() + " ##");
        JavaReflect.tests();

        System.out.println("\n## Test " + AnnotationWays.class.getSimpleName() + " ##");
        AnnotationWays.tests();

        System.out.println("\n\n\n########### JAVA 9 ###########");

        System.out.println("\n## Test " + ProjectJigsaw.class.getSimpleName() + " ##");
        ProjectJigsaw.tests();
    }
}