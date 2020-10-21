package PointPack;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        LineSegment line = new LineSegment(1,2,3,4);
        System.out.println(line.isInOneQuadrant());
        System.out.println(line.getLenght());
        line.moveBeginPoint(-5,7);
        System.out.println(line.isInOneQuadrant());
        System.out.println(line.getLenght());



    }
}
