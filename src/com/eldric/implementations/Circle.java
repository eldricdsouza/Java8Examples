package com.eldric.implementations;

import com.eldric.interfaces.Shape;

public class Circle implements Shape {

    int radius = 5;

    @Override
    public Double calculateArea() {
        return new Double( 3.14 * (radius ^ 2));
    }
}
