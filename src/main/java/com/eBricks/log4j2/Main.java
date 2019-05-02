package com.eBricks.log4j2;

public class Main {

    public static void main(String[] args) {
        Circle circle_object = new Circle(1,2,3);
        Rectangle rectangle_object = new Rectangle(2,1,3,2);

//        circle_object.draw();
        Shape shape_object = circle_object;
        shape_object.draw();
        shape_object = rectangle_object;
        shape_object.draw();

    }
}