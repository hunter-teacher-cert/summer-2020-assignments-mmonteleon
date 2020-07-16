import java.util.*;
public class InsertionSortDriver
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int testNum = 0;

    while(true)
    {
      System.out.println(" ***** Test #" + testNum + " *****");
      System.out.println("Unsorted: ");
      ArrayList<Integer> arr = Sort.makeItArRain(25);
      System.out.println(arr.toString());
      System.out.println("Sorted: ");
      Sort.insertionSort(arr);
      System.out.println(arr.toString());

      System.out.println("Test Again? Enter to continue.  Enter q to quit");
      if(input.nextLine().equals("q"))
        break;
      testNum++;
    }

  }
}//end class
