package PointPack;

public class Point {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void addXY(int adderX, int adderY){
        this.x += adderX;
        this.y += adderY;
    }

    public void addX(int adderX){
        addXY(adderX,0);
    }

    public void addY(int adderY){
       addXY(0,adderY);
    }

    public int getQuadrant() {

        if (this.x>0 && this.y>0){
            return 1;
        }
        if (this.x<0 && this.y>0){
            return 2;
        }
        if (this.x<0 && this.y<0){
            return 3;
        }
        if (this.x>0 && this.y<0){
            return 4;
        }
        else return 0;
    }

    public String toString(){
        return "(" + this.x +"," + this.y + ")";
    }


}
