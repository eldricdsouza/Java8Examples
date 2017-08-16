package com.eldric.interfaces;

public interface Shape {

    Double calculateArea();

    default void displayArea() {
        System.out.println("Default: Area = " + this.calculateArea());
    }

}
