import java.io.*;
import java.util.*;

public class BoogleCountTester
{

  public static void main( String[] args )
  {
    Scanner input = new Scanner(System.in);
    int testCount = 1;
    while(true)
    {
      int size = (int)Math.pow(10,testCount);
      ArrayList<Integer> al = BoogleCount.getPredictableArray(size);
      int target = (int)(Math.random()*size) * 2;

      //Print generated array, target, search method results
      System.out.println(" ***** Search Methods Test #" + testCount + " *****");
      System.out.println("Array Size: " + size);
      System.out.println("Target: " + target);
      BoogleCount.linSearch(al, target);
      BoogleCount.binSearch(al, target);
      BoogleCount.binSearch2(al, target);

      //Run more tests?
      System.out.println("**WARNING: If the array gets too big, this program will hang.**");
      System.out.println("\nEnter to run more tests or Q to quit");
      String choice = input.nextLine();
      if(choice.equals("q") || choice.equals("Q"))
        break;

      testCount++;
    }

  }//end main

}//end class
