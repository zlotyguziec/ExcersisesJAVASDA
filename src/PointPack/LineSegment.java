package PointPack;


public class LineSegment {
   private Point point1;
   private Point point2;




    public LineSegment(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public LineSegment(int x1, int x2, int y1, int y2) {
        this.point1 = new Point(x1,y1);
        this.point2 = new Point(x2,y2);
    }

    public boolean isInOneQuadrant(){
        return this.point1.getQuadrant()==this.point2.getQuadrant();
    }

    public double getLenght(){
        return Math.sqrt(Math.pow((this.point2.getX()-this.point1.getX()),2) + Math.pow((this.point2.getY()-this.point1.getY()),2));
    }

    public void moveBeginPoint(int x, int y){
        this.point1.addXY(x,y);
    }

    public void moveEndPoint(int x, int y){
        this.point2.addXY(x,y);
    }

}
