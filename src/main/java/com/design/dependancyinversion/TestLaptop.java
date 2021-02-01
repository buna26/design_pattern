package com.design.dependancyinversion;

public class TestLaptop {
    public static void main(String[] args) {
        Laptop l1 = new Laptop(new Intel());
        l1.buildLaptop();

        Laptop l2 = new Laptop();
        l2.setProcessor(new AMD());
        l2.buildLaptop();
    }
}
