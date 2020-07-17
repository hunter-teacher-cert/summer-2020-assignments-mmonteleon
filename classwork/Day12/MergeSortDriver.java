import java.util.*;
public class MergeSortDriver
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int testNum = 0;

    while(true)
    {
      System.out.println(" ***** Test #" + testNum + " *****");

      //Generate an ArrayList with 20 random integers
      ArrayList<Integer> arr = Sort.makeItArRain(20);
      System.out.println("Original Array: ");
      System.out.println(arr.toString());

      //Merge Sort the ArrayList
      arr = Sort.mergeSort(arr);
      System.out.println("Sorted Array: ");
      System.out.println(arr.toString());


      System.out.println("Test Again? Enter to continue.  Enter q to quit");
      if(input.nextLine().equals("q"))
        break;
      testNum++;
    }

  }
}//end class
