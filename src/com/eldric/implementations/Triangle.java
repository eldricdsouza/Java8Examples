package com.eldric.implementations;

import com.eldric.interfaces.Shape;

public class Triangle implements Shape {

    int base = 5;
    int height = 20;

    @Override
    public Double calculateArea() {
        return new Double ((base * height)/2);
    }

    @Override
    public void displayArea() {
        System.out.println("Area of Triangle = " + this.calculateArea());

    }
}
