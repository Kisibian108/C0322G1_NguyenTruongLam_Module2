package ss3_ClassAndMethod.Exercise.Fan;

import ss3_ClassAndMethod.Exercise.Fan.BuildFanClass;

public class Main2 {
    public static void main(String[] args) {
        BuildFanClass buildFanClass1 = new BuildFanClass(true, 10, "Yellow", 3);
        System.out.println( buildFanClass1);

        BuildFanClass buildFanClass2 = new BuildFanClass(false, 5, "Blue", 2);
        System.out.println( buildFanClass2);
    }
}
