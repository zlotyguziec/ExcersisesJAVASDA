package AdvancedJava.Task4Geometry;
 public abstract class Shape {

       protected ColorType color;
       protected boolean isFilled;
       public Shape() {
        color = ColorType.UNKNOWN;
        isFilled = false;
    }

    public Shape(ColorType color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public ColorType getColor() {
        return color;
    }

    public void setColor(ColorType color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public String getStringOfIsfilled(){
        if (isFilled)
            return "filled";
        else return "not filled";
    }

    abstract double getArea();

       abstract double getPerimeter();

    @Override
    public String toString() {
        return String.format("Shape with color of %s and " + getStringOfIsfilled(), color);
    }
}
