package AdvancedJava.Task4Geometry;

import AdvancedJava.Resizable;

public class ResizableCircle implements Resizable {

    private Circle circle;

    public void resize(int percentage){
        circle.r = circle.r*(1 + (double)1/percentage);
    }

}
