package ss3_ClassAndMethod.Exercise.Fan;

public class BuildFanClass {
    final int SLOW = 1, MEDIUM = 2, FAST = 3;
    boolean on = false;
    double radius;
    String color;

    public BuildFanClass() {
    }

    private int speed() {
        return SLOW;
    }

    private boolean status() {
        return false;
    }

    private double radius() {
        return 5;
    }

    private String color() {
        return "blue";
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    private boolean on() {
        return true;
    }

    private boolean off() {
        return false;
    }

    @Override
    public String toString() {
        return "BuildFanClass{" + " Fan is On" +
                ", FAST=" + FAST +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public String toString1() {
        return "BuildFanClass{" + " Fan is Off" +
                ", MEDIUM=" + MEDIUM +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

}
