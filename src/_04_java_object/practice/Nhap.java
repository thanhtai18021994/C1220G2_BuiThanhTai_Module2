package _04_java_object.practice;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Nhap {
    public static void main(String[] args) {
        LocalDateTime myTime =LocalDateTime.now();
        System.out.println(myTime);

        for (long i=0;i<1000000000;i++){

        }
        LocalDateTime myTime2 =LocalDateTime.now();
        System.out.println(myTime2);
        System.out.println(myTime2.getNano()-myTime.getNano());
    }
}
