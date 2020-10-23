package AdvancedJava.Task4Geometry;

import AdvancedJava.excersises.Point2D;

public class Circle extends Shape{

    protected double r;
    protected Point2D centerPoint;

    public Circle() {
        color = ColorType.UNKNOWN;
        isFilled = false;
        r = 1;
    }

    public Circle(double r, Point2D centerPoint) {
        this.r = r;
        this.centerPoint = centerPoint;
    }

    public Circle(ColorType color, boolean isFilled, double r) {
        super(color, isFilled);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getArea(){
        return Math.PI*Math.pow(r,2);
    }

    @Override
    public double getPerimeter(){
        return Math.PI*r*2;
    }

    @Override
    public String toString() {
        return String.format("Circle with radius=%s which is subclass of " + super.toString(), r);
    }
}
