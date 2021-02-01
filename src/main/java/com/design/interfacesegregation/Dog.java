package com.design.interfacesegregation;

public class Dog implements Pets{
    @Override
    public void feed() {
        System.out.println("Feeding the dog !!");
    }

    @Override
    public void training() {
        System.out.println("Training the dog !!");
    }
}
