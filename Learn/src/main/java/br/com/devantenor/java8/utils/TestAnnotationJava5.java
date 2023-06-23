package br.com.devantenor.java8.utils;

import java.math.BigDecimal;

public class TestAnnotationJava5 {
    private Integer testNumber;

    @Override
    public String toString() {
        return "testeOverride{" +
                "testNumber=" + testNumber +
                '}';
    }

    @Deprecated
    public String getTestNumberAsString() {
        return this.testNumber.toString();
    }

    @SuppressWarnings("deprecation")
    public BigDecimal getAsBigDecimal() {
        return new BigDecimal(getTestNumberAsString());
    }
}
