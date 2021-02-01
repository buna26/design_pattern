package com.design.interfacesegregation;

public class Tester {
    public static void main(String[] args) {
        Pets dog = new Dog();
        dog.feed();
        dog.training();
        Animal tiger = new Tiger();
        tiger.feed();
    }
}
