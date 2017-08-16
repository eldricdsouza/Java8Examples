package com.eldric.study;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("eldric", "david", "vijendar", "gomathy", "neelima");
        Collections.sort(names, (a,b) -> b.compareTo(a));
        System.out.println(names);

    }

}
