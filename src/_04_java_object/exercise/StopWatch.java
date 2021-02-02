package _04_java_object.exercise;

import java.time.LocalDateTime;
import java.util.Date;
class Watch{
    private LocalDateTime startTime() {
        LocalDateTime myTime = LocalDateTime.now();
        return myTime;
    }
    private LocalDateTime endTime() {
        LocalDateTime myTime2 = LocalDateTime.now();
        return myTime2;
    }
    public LocalDateTime stop(){
        return endTime() ;
    }public LocalDateTime start(){
        return startTime();
    }

}
public class StopWatch {
    public static void main(String[] args) {
        Watch myWatch=new Watch();
        LocalDateTime t1=myWatch.start();
        for(long i=0;i<10000000;i++){

        }
        LocalDateTime t2=myWatch.stop();
        System.out.println(t2.getNano()-t1.getNano());
    }
}
