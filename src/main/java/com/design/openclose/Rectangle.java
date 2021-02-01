package com.design.openclose;

public class Rectangle implements Shape{
    private Integer height;
    private Integer width;
    public Rectangle(Integer height, Integer width){
        this.width = width;
        this.height = height;
    }
    @Override
    public Integer area() {
        return this.height * this.width;
    }
}
