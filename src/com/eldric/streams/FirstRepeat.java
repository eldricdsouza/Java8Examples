package com.eldric.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeat {

    public static void main(String[] args) {
        Map<Character, Long> collect =  "abcsdnvs".chars().mapToObj(i -> (char)i).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        collect.forEach( (x,y) -> System.out.println( "Key: " + x + " Val: " + y));

        collect.forEach(MyPrinter::print);
        //Arrays.asList(1,2,3,4).forEach()

        /*List<Integer> myArgs = Arrays.asList(1 ,2 ,3, 4);
        myArgs.forEach(System.out::println); */

        Optional<Character> firstNonRepeat = collect.entrySet().stream().filter( (e) -> e.getValue() == 1).map(e -> e.getKey()).findFirst();
        if(firstNonRepeat.isPresent()) {
            System.out.println("First non repeating:" + firstNonRepeat.get());
        }
        Optional<Character> firstRepeat = collect.entrySet().stream().filter( (e) -> e.getValue() > 1).map(e -> e.getKey()).findFirst();
        System.out.println("First repeating:" + firstRepeat.orElse(null));
    }
}

class MyPrinter {

    public static void print(Character c, Long v) {
        System.out.println("print");
    }
}


