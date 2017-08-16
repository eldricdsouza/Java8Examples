package com.eldric.study;

import com.eldric.implementations.Circle;
import com.eldric.implementations.Rectangle;
import com.eldric.implementations.Triangle;
import com.eldric.interfaces.Shape;

public class FunctionalInterfaceExample2 {


    public static void main (String[] args) {

        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        Shape circle = new Circle();


        rectangle.displayArea();
        triangle.displayArea();
        circle.displayArea();

    }
}
