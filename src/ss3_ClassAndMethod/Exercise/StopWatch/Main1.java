package ss3_ClassAndMethod.Exercise.StopWatch;

import ss3_ClassAndMethod.Exercise.StopWatch.StopWatch;

public class Main1 {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        long startTime = stopWatch.startTime();
        int sum =0;
        for (int i = 0; i < 10000000; i++) {
            sum += i;
        }
        long stopTime = stopWatch.stopTime();
        long elapseTime = stopTime - startTime;

        System.out.println("Thoi gian bat dau la: " + startTime);
        System.out.println("Thoi gian ket thuc la: " + stopTime);
        System.out.println("Thoi gian da chay la: " + elapseTime);
    }
}
