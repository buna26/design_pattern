package com.design.liskovsubstitution;

public class CalculateArea {
    public static void main(String[] args) {
        Rectangle r = new Square();
        r.setHeight(5);
        r.setWidth(4);
        System.out.println(r.getArea());
    }
}
