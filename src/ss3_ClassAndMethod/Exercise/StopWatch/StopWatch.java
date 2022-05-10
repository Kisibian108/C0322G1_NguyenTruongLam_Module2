package ss3_ClassAndMethod.Exercise.StopWatch;

import java.util.Date;

public class StopWatch {
    long startTime, endTime;
    StopWatch(){
    }

    public long startTime(){
        return System.currentTimeMillis();
    }

    public long stopTime()
    {
        return System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return stopTime() - startTime();
    }
}
