package com.design.dependancyinversion;

public class Intel implements Processor{
    @Override
    public void buildProcessor() {
        System.out.println("This is intel processor");
    }
}
