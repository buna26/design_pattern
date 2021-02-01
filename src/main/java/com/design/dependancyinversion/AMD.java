package com.design.dependancyinversion;

public class AMD implements Processor{
    @Override
    public void buildProcessor() {
        System.out.println("This is AMD Processor");
    }
}
