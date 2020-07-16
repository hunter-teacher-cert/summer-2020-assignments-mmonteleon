import java.util.*;
public class SelectionSortDriver
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int testNum = 0;

    while(true)
    {
      System.out.println(" ***** Test #" + testNum + " *****");
      System.out.println("Array 1: ");
      ArrayList<Integer> arr1 = Sort.makeItArRain(10);
      Sort.selectionSort(arr1);
      System.out.println(arr1.toString());

      System.out.println("Array 2: ");
      ArrayList<Integer> arr2 = Sort.makeItArRain(10);
      Sort.selectionSort(arr2);
      System.out.println(arr2.toString());

      System.out.println("Merged: ");
      ArrayList<Integer> arr3 = Sort.merge(arr1, arr2);
      System.out.println(arr3.toString());

      System.out.println("Test Again? Enter to continue.  Enter q to quit");
      if(input.nextLine().equals("q"))
        break;
      testNum++;
    }

  }
}//end class
