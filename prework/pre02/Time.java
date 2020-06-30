public class Time
{
  public static void main(String[] args) {
    int hour = 10;
    int minute = 3;
    int second = 8;
    final int secondsInDay = 86400;

    int secondsSinceMidnight = hour*3600 + minute*60 + second;
    int secondsRemainingInDay = secondsInDay - secondsSinceMidnight;
    double percentPassed = (double)secondsSinceMidnight/secondsInDay * 100;

    int hour2 = 10;
    int minute2 = 7;
    int second2 = 20;

    System.out.println("Start Time: " + hour + ":" + minute + ":" + second);
    System.out.println("Seconds since midnight: " + secondsSinceMidnight);
    System.out.println("Seconds remaining in the day: " + secondsRemainingInDay);
    System.out.println("Percent of Day Passed: " + percentPassed + "%");
    System.out.println("End Time: " + hour2 + ":" + minute2 + ":" + second2);
    System.out.println("Elapsed time: " + (hour2 - hour) + ":" + (minute2 - minute) + ":" + (second2 - second));



  }
}
