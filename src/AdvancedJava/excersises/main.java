package AdvancedJava.excersises;

public class main {


    public static void main(String[] args) {
        Point3D point3D = new Point3D(2,3,5);
      //  System.out.println(point3D.toString());
        Line line = new Line(3,4,5,6);
        System.out.println(line.getMiddlePoint());
        System.out.println(line.getLenght());

    }
}
