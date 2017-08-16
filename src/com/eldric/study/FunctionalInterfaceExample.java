package com.eldric.study;


@FunctionalInterface
public interface FunctionalInterfaceExample {

   void toTest();

   //example of Extension Methods (Java 8)
   default String toReturnString(String a) {
       return a;
   }

    //example of Extension Methods (Java 8)
   default Integer toReturnInteger(Integer i) {
       return i;
   }

}


