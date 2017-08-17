package com.eldric.streams;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MatchPredicateExample {

    public static void main(String[] args) {

        MatchPredicateExample matchObject = new MatchPredicateExample();
        List<String> stringCollection = Arrays.asList("ddd2", "aaa2", "bbb1", "aaa1", "bbb3", "cccc", "bbb2", "ddd1");


        Boolean anyStartsWithA = matchObject.anyStartsWithA.test(stringCollection);
        System.out.println("anyStartsWithA [" + anyStartsWithA + "]");

        Boolean allStartsWithA = matchObject.allStartsWithA.test(stringCollection);
        System.out.println("allStartsWithA [" + allStartsWithA + "]");


        Boolean noneStartsWithZ = matchObject.noneStartsWithZ.test(stringCollection);
        System.out.println("noneStartsWithZ [" + noneStartsWithZ + "]");

    }

    Predicate<List<String>> anyStartsWithA =  matchList -> matchList.stream().anyMatch(s -> s.startsWith("a"));
    Predicate<List<String>> allStartsWithA =  matchList -> matchList.stream().allMatch(s -> s.startsWith("a"));
    Predicate<List<String>> noneStartsWithZ = matchList -> matchList.stream().noneMatch(s -> s.startsWith("z"));

}
