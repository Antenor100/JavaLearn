package br.com.devantenor.java8.utils;

import java.lang.annotation.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

//How to create different types of Annotations
@Target(ElementType.TYPE_USE)
@interface MyAnnotation{}

@Repeatable(MyMessages.class)
@interface MyAnnotationWithMessage{
    String myMessage();
    String type();
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyMessages{
    MyAnnotationWithMessage[] value();
}

@MyAnnotationWithMessage(myMessage = "test1", type = "1")
@MyAnnotationWithMessage(myMessage = "test2", type = "2")
public class TestAnnotationJava8 extends @MyAnnotation TestAnnotationJava5 {
    private List<@MyAnnotation String> names;
    private @MyAnnotation String[] ages;
    TestAnnotationJava8 testAnnotationJava8;
    Function<TestAnnotationJava8, List<String>> f;
    NestedClassExemple.@MyAnnotation InternalNestedClass nestedClass;

    public TestAnnotationJava8() {
        this.names = new @MyAnnotation ArrayList<>();
        this.testAnnotationJava8 = (@MyAnnotation TestAnnotationJava8) new TestAnnotationJava5();
        this.f = TestAnnotationJava8::getNames;
    }

    public @MyAnnotation List<String> getNames() {
        try {
            return names;
        } catch (@MyAnnotation Exception e) {
            System.out.println("Test");
        } finally {
            return null;
        }
    }

    public boolean isTesteAnnotationSincejava8(@MyAnnotation Object c) throws @MyAnnotation Exception{
         @MyAnnotation boolean isTest = c instanceof @MyAnnotation TestAnnotationJava8;
         return isTest;
    }

    public static void printClassAnnotationMessages() {
        MyAnnotationWithMessage[] messages = TestAnnotationJava8.class.getAnnotationsByType(MyAnnotationWithMessage.class);
        Arrays.stream(messages).forEach(System.out::println);
    }
}
