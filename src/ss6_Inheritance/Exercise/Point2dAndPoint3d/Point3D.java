package ss6_Inheritance.Exercise.Point2dAndPoint3d;

public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D() {
    }

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

    public void setXYZ(float X, float Y, float Z){
    }

    public float [] getXYZ (){
        return new float[]{super.getX(), super.getY(), this.getZ()};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "get XYZ =" + getXYZ() +
                super.toString() +
                '}';
    }
}
