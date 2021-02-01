package com.design.liskovsubstitution;

public class Rectangle {
    private Integer height;
    private Integer width;

    public Integer getHeight() {
        return this.height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return this.width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getArea(){
        return this.getWidth() * this.getHeight();
    }

}
