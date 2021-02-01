package com.design.liskovsubstitution;

public class Square extends Rectangle{
    private Integer height;
    private Integer width;

    @Override
    public Integer getHeight() {
        return height;
    }

    @Override
    public void setHeight(Integer height) {
        this.height = height;
        this.width = height;
    }

    @Override
    public Integer getWidth() {
        return width;
    }

    @Override
    public void setWidth(Integer width) {
        this.width = width;
        this.height = width;
    }
}
