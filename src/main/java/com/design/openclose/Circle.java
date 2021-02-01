package com.design.openclose;

public class Circle implements Shape{
    private Integer side;

    public Circle(Integer side) {
        this.side = side;
    }
    @Override
    public Integer area() {
        return (int)3.14 * this.side * this.side;
    }
}
