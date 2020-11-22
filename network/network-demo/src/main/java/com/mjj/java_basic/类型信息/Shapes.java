package com.mjj.java_basic.类型信息;

import java.util.Arrays;
import java.util.List;

public class Shapes {
    public static void main(String[] args) {

        // Circle 向上转型 --> Shape
        List<Shape> shapeList = Arrays.asList(new Circle(),new Square(),new Triangle());
        for(Shape shape : shapeList){
            System.out.println("当前class的name: " + shape.getClass().getName());
            shape.draw();
        }
    }
}
