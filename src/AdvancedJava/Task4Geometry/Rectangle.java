package AdvancedJava.Task4Geometry;

public class Rectangle extends Shape{

    protected double width;
    protected double lenght;

    public Rectangle() {
        color = ColorType.UNKNOWN;
        isFilled = false;
        width = 1;
        lenght = 1;
    }

    public Rectangle(ColorType color, boolean isFilled, double width, double lenght) {
        super(color, isFilled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getArea(){
        return width*lenght;
    }

    public double getPerimeter(){
        return (lenght+width)*2;
    }

    @Override
    public String toString() {
        return String.format("Rectangle with width=%s and lenght=%s which is subclass of " + super.toString(), width,lenght);
    }


}
