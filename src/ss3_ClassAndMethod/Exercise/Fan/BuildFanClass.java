package ss3_ClassAndMethod.Exercise.Fan;

public class BuildFanClass {
    final int SLOW = 1, MEDIUM = 2, FAST = 3;
    boolean on = false;
    double radius;
    String color;
    int speed;

    public BuildFanClass(boolean on, double radius, String color, int speed) {
        this.on = on;
        this.radius = radius;
        this.color = color;
        this.speed = speed;
    }

    public BuildFanClass(boolean on, double radius, String color) {
        this.on = true;
        this.radius = radius;
        this.color = color;
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
        return "{" +
                "on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }
}
