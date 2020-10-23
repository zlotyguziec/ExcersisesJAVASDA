package AdvancedJava.excersises;

public class Point3D extends Point2D{
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] result = new float[3];
        result[0] = this.getX();
        result[1] = this.getY();
        result[2] = this.z;
        return result;
    }

    public void setXYZ(float x, float y, float z) {
        this.setXY(x, y);
        setZ(z);
    }

    public String toString() {
        return toString() + ", " + z + ')';
    }
}
