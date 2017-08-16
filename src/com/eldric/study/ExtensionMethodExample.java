package com.eldric.study;

public interface ExtensionMethodExample {

    Double calculate(Integer integer);

    default Double squareRoot(Double mydouble) {
        return Math.sqrt(mydouble);
    }

}
