package ss3_ClassAndMethod.Exercise.Fan;

import ss3_ClassAndMethod.Exercise.Fan.BuildFanClass;

public class Main2 {
    public static void main(String[] args) {
        BuildFanClass buildFanClass1 = new BuildFanClass();

        buildFanClass1.setColor("Yellow");
        buildFanClass1.setRadius(10);
        System.out.println(buildFanClass1.toString());

        BuildFanClass buildFanClass2 = new BuildFanClass();
        buildFanClass2.setColor("Blue");
        buildFanClass2.setRadius(5);
        System.out.println(buildFanClass2.toString1());
    }
}
