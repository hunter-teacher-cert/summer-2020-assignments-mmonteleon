import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args)
    {
      Time t = new Time();
      Time time = new Time(11, 59, 59.9);
      System.out.println(time);
      Time.printTime(time);

      Time time1 = new Time(9, 30, 0.0);
      Time time2 = time1;
      Time time3 = new Time(9, 30, 0.0);
      System.out.println("time1.equals(time3): " + time1.equals(time3));
      System.out.println("time1 == time3: " + (time1 == time3));

      Time startTime = new Time(18, 50, 0.0);
      Time runningTime = new Time(2, 16, 0.0);
      Time endTime = Time.add(startTime, runningTime);
      System.out.println("Start: " + startTime);
      System.out.println("Run Time: " + runningTime);
      System.out.println("End: " + endTime);

      Time endTime2 = startTime.add(endTime);
      System.out.println("End2: " + endTime);
    }
}
