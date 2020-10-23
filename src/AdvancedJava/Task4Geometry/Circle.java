package AdvancedJava.Task4Geometry;

public class Circle extends Shape{

    private double r;

    public Circle() {
        color = ColorType.UNKNOWN;
        isFilled = false;
        r = 1;
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
