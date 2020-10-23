package AdvancedJava.excersises;

public class Line {

    public Point2D pointA;
    public Point2D pointB;

    public Line(Point2D pointA, Point2D pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public Line(float XA, float YA, float XB, float YB) {
        pointA = new Point2D(XA,XB);
        pointB = new Point2D(YA,YB);
    }

    public Point2D getPointA() {
        return pointA;
    }

    public Point2D getPointB() {
        return pointB;
    }

    public void setPointA(Point2D pointA) {
        this.pointA = pointA;
    }

    public void setPointB(Point2D pointB) {
        this.pointB = pointB;
    }

    public double getLenght(){
        return Math.sqrt(Math.pow((pointB.getX())- pointA.getX(),2) + Math.pow(pointB.getY()- pointA.getY(),2));
    }

    public Point2D getMiddlePoint(){
        return new Point2D((pointA.getX()+ pointB.getX())/2,(pointA.getY()+ pointB.getY())/2);
    }

}
