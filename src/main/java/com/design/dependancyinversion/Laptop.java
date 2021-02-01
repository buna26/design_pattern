package com.design.dependancyinversion;

public class Laptop {
    private Processor p;
    public Laptop(){}
    // dependency injection using Constructor
    public Laptop(Processor p){
        this.p = p;
    }

    // dependency injection using setter method
    public void setProcessor(Processor p){
        this.p = p;
    }
    public void buildLaptop(){
        this.p.buildProcessor();
        System.out.println("Laptop is ready !!");

    }
}
