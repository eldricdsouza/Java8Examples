package com.eldric.test;

import java.util.Arrays;
import java.util.OptionalInt;

public class Solution {

    public void solution(int[] A, int K) {

        OptionalInt maxValue =  Arrays.stream(A).boxed().mapToInt(Integer::intValue).max();
        Integer maxValueArray = maxValue.getAsInt();
        Integer padding = maxValueArray.toString().length();

        System.out.println(padding);
        System.out.println(maxValueArray);

    }


    public static void main(String[] args) {
        int[] myIntArray = {1, 2, 3, 1500 , 16 , 37, 43 , 88 , 95, 77  };
        Solution mySolution = new Solution();
        mySolution.solution(myIntArray, 5);
    }

}
