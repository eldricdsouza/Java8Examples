package com.eldric.implementations;

import com.eldric.interfaces.Shape;

public class Rectangle implements Shape {

    int len = 5;
    int bre = 5;

    @Override
    public Double calculateArea() {
        return new Double(len * bre);
    }
}
