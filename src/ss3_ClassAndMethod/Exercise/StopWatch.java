package ss3_ClassAndMethod.Exercise;

import java.util.Date;

public class StopWatch {
    long startTime, endTime;

     StopWatch(long startTime, long endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long startTime(){
        return System.currentTimeMillis();

    }

    public long stopTime(){
        return System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return startTime() - stopTime();
    }

}
