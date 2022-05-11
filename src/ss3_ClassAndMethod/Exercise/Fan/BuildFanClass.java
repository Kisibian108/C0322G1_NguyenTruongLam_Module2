package ss3_ClassAndMethod.Exercise.Fan;

public class BuildFanClass {
    final int SLOW = 1, MEDIUM = 2, FAST = 3;
    boolean on = false;
    double radius = 5;
    String color = "Blue";
    int speed = SLOW;

    public BuildFanClass(boolean on, double radius, String color, int speed) {
        this.on = on;
        this.radius = radius;
        this.color = color;
        this.speed = speed;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        if (this.isOn()) {
            return "Fan is On{" +
                    " Speed =" + getSpeed() +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        } else {
            return "Fan is Off{" +
                    " radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';

        }
    }
}
