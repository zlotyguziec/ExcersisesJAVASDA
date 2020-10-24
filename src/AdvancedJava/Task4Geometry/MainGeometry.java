package AdvancedJava.Task4Geometry;

import AdvancedJava.excersises.Point2D;

public class MainGeometry {


    public static void main(String[] args) {

        Square square = new Square(5);
        System.out.println(square.getArea());
        System.out.println(square.toString());
        Rectangle rectangle = new Rectangle(4.35, 6.75);
        System.out.println(rectangle.toString());
        System.out.println(rectangle.getArea());

        Circle circle = new Circle(45);
        System.out.println(circle.getArea());


    }
}
