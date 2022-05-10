package ss3_ClassAndMethod.Exercise;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int sum =0;
        for (int i = 0; i < 10000000; i++) {
            sum += i;
        }
        long stopTime = System.currentTimeMillis();
        long ElapseTime = stopTime - startTime;

        StopWatch stopWatch = new StopWatch(startTime, stopTime);
        System.out.println("Thoi gian bat dau la: " + stopWatch.startTime());
        System.out.println("Thoi gian ket thuc la: " + stopWatch.stopTime());
        System.out.println("Thoi gian da chay la: " + ElapseTime);
    }
}
