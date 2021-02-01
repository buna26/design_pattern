package com.design.openclose;

public class Area {
    public static void main(String[] args) {
        Shape[] arr = {
                new Square(5),
                new Circle(5),
                new Square(6),
                new Rectangle(5, 6)
        };
        for(var obj : arr){
            System.out.println(obj.area());
        }
    }
}
