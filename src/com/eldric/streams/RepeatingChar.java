package com.eldric.streams;

import java.util.stream.Collectors;

public class RepeatingChar {

    public static void main(String[] args) {

        String myString = "the quick brown fox jumped over the lazy dog" ;
        System.out.println(myString.chars().mapToObj(i -> (char)i).collect(Collectors.groupingBy(Object :: toString, Collectors.counting())));


    }
}
