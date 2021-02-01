package com.design.openclose;

public class Square implements Shape{
    private Integer side;
    public Square(Integer side){
        this.side = side;
    }
    @Override
    public Integer area() {
        return this.side * this.side;
    }
}
