package ss3_ClassAndMethod.Exercise;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        long startTime = stopWatch.startTime();
        int sum =0;
        for (int i = 0; i < 10000000; i++) {
            sum += i;
        }
        long stopTime = stopWatch.stopTime();
        long ElapseTime = stopTime - startTime;

        System.out.println("Thoi gian bat dau la: " + startTime);
        System.out.println("Thoi gian ket thuc la: " + stopTime);
        System.out.println("Thoi gian da chay la: " + ElapseTime);
    }
}
