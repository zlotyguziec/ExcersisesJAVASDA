package AdvancedJava.excersises;

import AdvancedJava.Movable;

public class MovablePoint extends Point2D implements Movable {

    private final Point2D point;
    private final int xSpeed;
    private final int ySpeed;

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public MovablePoint(Point2D point, int xSpeed, int ySpeed) {
        this.point = point;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp() {
        point.setY(point.getY() + ySpeed);
    }

    public void moveDown() {
        point.setY(point.getY() - ySpeed);
    }

    public void moveLeft() {
        point.setX(point.getX() - xSpeed);
    }

    public void moveRight() {
        point.setX(point.getX() + xSpeed);
    }


}
